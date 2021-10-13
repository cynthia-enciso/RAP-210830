-- DML: Data Manipulation Language, CRUD operations (create, read, update, and delete)

/* -------------------------- insert --------------------------------*/
SELECT * FROM student;  

INSERT INTO student 
VALUES
	(default, 'Fabian', 'Smith', 4.0, default, '03/25/2011'),
	(default, 'Jessica', 'Smith', 3.0, default, '01/15/1995'),
	(default, 'Wanda', 'Smith', 4.0, default, '12/10/2011'),
	(default, 'Geoff', 'James', 2.5, default, '09/22/2020'),
	(default, 'Rodrigo', 'James', 4.0,  default, '03/25/2011'),
	(default, 'Patricia', 'Baxter', 3.0, default, '03/25/2011'),
	(default, 'Kelly', 'Baxter', 3.5, default, '04/01/2012'),
	(default, 'Tim', 'Baxter', 2.0,  default, '03/25/2012'),
	(default, 'Tom', 'Baxter', 1.5, default, '04/20/2001'),
	(default, 'Francis', 'Smith', 1.0, default, '03/18/2000'),
	(default, 'Alma', 'James', 3.5, default, '08/04/2010')
	RETURNING *
;

INSERT INTO student(first_name, last_name, gpa, graduation) VALUES
	('Kathrine', 'Hopkins', 2.0, '2020-04-15'), 
	('Abraham', 'Armijo', 1.5, null),
	('Carol', 'Coulson', 3.5, '2020-12-22'),
	('Kyle', 'Jameson', null, null),
	('Edwina', 'Grape', 4.0, '2019-02-13'),
	('Lyle', 'Crocodile', 1.5, '2015-04-20'),
	('Jackson', 'Ford', 2.0, '2021-03-24'),
	('Freddie', 'Carmichael', null, '2016-02-15'),
	('Michael', 'Michaels', 1.0, null),
	('Jamie', 'Sanchez', 4.0, '2014-03-12'),
	('Abigail', 'Carr', 3.2, '2019-08-01'),
	('Emily', 'Wellson', 3, '2015-04-20'),
	('Emily', 'Larson', 4.0, '2015-04-20') 
;

INSERT INTO student(first_name, last_name, gpa, graduation) VALUES('Jillian', 'Fredrickson', 1.5, '10/03/2001') RETURNING *;
INSERT INTO student(first_name, last_name, gpa, graduation) VALUES('Christie', 'Philips', -4, '2020-03-10') RETURNING *;



/* -------------------------- update --------------------------------*/
-- update one record
UPDATE student SET gpa = 0.5 WHERE id = 9 RETURNING *;
-- updating multiple records
UPDATE student SET gpa = 2.5 WHERE id > 10 RETURNING *;
-- updating one record, multiple columns
UPDATE student SET gpa = 2.8, graduation = '2020-05-12' WHERE id = 5 RETURNING *;
-- updating all records, one column
UPDATE student SET is_doing_well = (gpa > 2.0) RETURNING *;

/* -------------------------- delete --------------------------------*/
DELETE FROM student RETURNING *;
INSERT INTO student(first_name, last_name, gpa, graduation) VALUES('Billy', 'Smith', 4.0, '2020-03-03');
TRUNCATE student RESTART IDENTITY;
DELETE FROM student WHERE gpa IS NULL;

/* -------------------------- SELECT --------------------------------*/
SELECT * FROM student;
-- WHERE clause: conditional expression used with SELECT, update, and delete
-- you can use comparison operators (=, >, <, >=, <=, !=) with WHERE
-- or logical operators (AND, OR, IN, BETWEEN, LIKE, IS NULL, NOT) with WHERE
SELECT * FROM student WHERE gpa > 2; -- doesn't take null into account
SELECT (id, first_name, last_name) FROM student WHERE gpa > 2;
SELECT DISTINCT gpa FROM student;

-- LIKE: looking for a value that matches a pattern
----- %: matches zero or more characters
SELECT * FROM student WHERE first_name LIKE 'C%';
SELECT * FROM student WHERE first_name NOT LIKE 'C%';

----- ILIKE: same as like but ignores casing
SELECT * FROM student WHERE first_name LIKE 'e%';
SELECT * FROM student WHERE first_name ILIKE 'e%';

SELECT * FROM student WHERE last_name ILIKE '%son';
SELECT * FROM student WHERE last_name ILIKE '%ch%';

-----_: matches a single character
SELECT * FROM student WHERE first_name ILIKE '_yle';
SELECT * FROM student WHERE first_name ILIKE '__i%';

-- BETWEEN: looking for a range of values
SELECT * FROM student WHERE gpa BETWEEN 1 and 3; -- inclusive
SELECT * FROM student WHERE gpa NOT BETWEEN 1 and 3;

-- IS NULL: returns records that have null in the specified column
SELECT * FROM student WHERE gpa IS NULL;
SELECT * FROM student WHERE gpa IS NOT NULL;

-- IN: returns records WHERE column value is in listed values
SELECT * FROM student WHERE gpa IN(3.5, 4);

-- LIMIT/OFFSET
SELECT * FROM student LIMIT 5;
SELECT * FROM student LIMIT 5 OFFSET 10;

-- ORDER BY
SELECT * FROM student ORDER BY gpa ASC; -- nulls last by default
SELECT * FROM student ORDER BY gpa DESC; -- nulls first by default
SELECT * FROM student ORDER BY gpa ASC NULLS FIRST;
SELECT * FROM student ORDER BY gpa DESC NULLS LAST;
SELECT * FROM student WHERE first_name LIKE 'E%' ORDER BY gpa DESC; -- note order by is last
-- get 5 most recent graduates
SELECT * FROM student ORDER BY graduation DESC NULLS LAST LIMIT 5;

-- subquery
	-- SELECT clause inside of another SELECT statement 
SELECT * FROM student WHERE gpa > (SELECT AVG(gpa) FROM student); -- average is 2.5
SELECT AVG(gpa) FROM student;

/* -------------------------- scalar functions --------------------------------*/
-- scalar function: for every input, returns a value
-- string functions:
----- char_length/character_length
SELECT first_name, CHAR_LENGTH(first_name) FROM student;
----- upper
SELECT first_name, UPPER(first_name) FROM student;
----- lower
SELECT first_name, LOWER(first_name) FROM student;
----- initcap: capitalizes the first letter of every word
UPDATE student SET first_name = LOWER(first_name) RETURNING *; 
SELECT INITCAP(first_name) FROM student;
SELECT * FROM student;
UPDATE student SET first_name = INITCAP(first_name) RETURNING *; 
---- concat
SELECT CONCAT(first_name, '''s gpa: ', gpa) FROM student;

-- math functions:
----- abs
SELECT ABS(gpa) FROM student;
----- floor
SELECT DISTINCT gpa, FLOOR(gpa) FROM student;
----- ceil
SELECT DISTINCT gpa, CEIL(gpa) FROM student;

-- coalesce: returns first argument that is not null
SELECT gpa FROM student;
SELECT COALESCE(gpa, 0) FROM student;

/* -------------------------- aggregate functions --------------------------------*/
-- aggregate function: takes lots of input and return one value
-- aggregate functions do not evaluate null values
-- COUNT
SELECT COUNT(*) FROM student; -- count total recods
SELECT COUNT(graduation) FROM student; -- counts all not null graduation values
SELECT COUNT(DISTINCT gpa) FROM student;
SELECT COUNT(first_name) FROM student WHERE first_name like 'K%';

-- MAX
SELECT MAX(graduation) FROM student; -- dates
SELECT MAX(gpa) FROM student; -- decimal
SELECT MAX(first_name) FROM student; -- text
-- MIN
SELECT MIN(graduation) FROM student;
SELECT MIN(gpa) FROM student;
SELECT MIN(first_name) FROM student;
-- avg
SELECT AVG(gpa) FROM student; -- works only with numbers
-- sum
SELECT SUM(gpa) FROM student;

/* -------------------------- grouping --------------------------------*/
-- groups result of SELECT statement by one or more columns
-- used with aggregate functions
-- expressions not in an aggregate function must be included in GROUP BY clause
SELECT COUNT(gpa) FROM student; -- not null only
SELECT COUNT(gpa), gpa FROM student GROUP BY gpa; 
SELECT COUNT(*), gpa FROM student GROUP BY gpa; -- using wildcard allows us to count nulls as well
 -- additionally, filter results of aggregate function with having clause.
SELECT COUNT(*), gpa FROM student GROUP BY gpa HAVING COUNT(*) > 1;  -- filter after function executes
SELECT COUNT(*), gpa FROM student WHERE gpa > 1 GROUP BY gpa; -- filter before function executes
SELECT COUNT(*), gpa FROM student WHERE gpa > 1 GROUP BY gpa HAVING COUNT(*) > 1; -- filtering before and after