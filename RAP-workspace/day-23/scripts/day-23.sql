-- what if you want data combined into a resultset from multiple tables?
	-- select statement with aliases
	-- JOIN operation
	-- SET operation

-- alias: giving another name to a column or table

-- column alias
SELECT CONCAT(first_name, ' ', last_name) AS "Full Name" FROM student;

-- table alias
SELECT CONCAT(first_name, ' ', last_name) "Full Name" FROM student s;

SELECT CONCAT(s.first_name, ' ', s.last_name) AS "Child Name", CONCAT(p.first_name, ' ', p.last_name) AS "Parent Name"
FROM student s, parent p
WHERE s.last_name = p.last_name;

 UPDATE student SET first_name = subquery.full_name FROM (SELECT s.first_name, s.last_name, CONCAT(s.first_name, ' ', s.last_name) AS full_name FROM student s) AS subquery where student.first_name = subquery.first_name;
SELECT * FROM student;

-- uses bridge table to compare
select CONCAT(s.first_name, ' ', s.last_name) AS "Child", CONCAT(p.first_name, ' ', p.last_name) AS "Parent"
from parent p, student s, student_parent sp
where s.id = sp.student_id AND p.id = sp.parent_id;

-- insert new records
-- add data that doesn't have matches
insert into student values (default, 'Greg', 'Meyers', 4.0, default, '2018-03-24', 3, 1),
							(default, 'Kesley', 'Biggs', 2.0, default, '2016-01-15', 2, 1), 
							(default, 'Patrick', 'Crumwell', 1.5, default, '2015-03-24', 2, 1),
							(default, 'Georgia', 'Linden', 4.0, default, '2016-10-20', 2, 1);

insert into parent values (default, 'Guy', 'Orrickson', default),
							(default, 'Fiona', 'Garrison', default),
							(default, 'Yvonne', 'Newman', default), 
							(default, 'Dorian', 'Mason', default);
						
-- not too apparent that they don't have relationships
SELECT * FROM student;
SELECT * FROM parent;



-- JOINs: require that both tables have a column that tracks the same data
	-- they are usually foreign keys, but they don't have to be.
	-- on clause specifies condition or columns to join on
	-- returns results horizontally

-- equijoin: uses = operator in on clause
-- theta join: uses a comparison other than = operator in on clause

-- inner join: returns matches. any similar columns are duplicated
-- natural join: returns matches. any similar columns are shared
-- left/right/full joins: return all records from A, B, or both
-- outer join: return nulls

-- INNER JOIN: returns MATCHES only
SELECT s.first_name, s.last_name, p.first_name, p.last_name 
FROM student s
INNER JOIN parent p
ON s.last_name = p.last_name;

-- LEFT JOIN: returns all records from first table and any matches from second table
SELECT s.first_name, s.last_name, p.first_name, p.last_name 
FROM student s
LEFT JOIN parent p
ON s.last_name = p.last_name;

-- RIGHT JOIN: returns all records from second table and any matches from first table
SELECT s.first_name, s.last_name, p.first_name, p.last_name 
FROM student s
RIGHT JOIN parent p
ON s.last_name = p.last_name;

-- LEFT OUTER JOIN: returns all records from first table that have nulls from second table
SELECT s.first_name, s.last_name, p.first_name, p.last_name 
FROM student s
LEFT JOIN parent p
ON s.last_name = p.last_name
WHERE p.last_name IS NULL;

-- RIGHT OUTER JOIN: returns all records from second table that have nulls from first table
SELECT s.first_name, s.last_name, p.first_name, p.last_name 
FROM student s
RIGHT JOIN parent p
ON s.last_name = p.last_name
WHERE s.last_name IS NULL;

-- FULL JOINS: 
-- all records returned from both tables
-- returns what inner, left and right outer joins return
select s.first_name, s.last_name, p.first_name, p.last_name
from student s
full join parent p on s.last_name = p.last_name;

-- FULL OUTER JOIN:
select s.first_name, s.last_name, p.first_name, p.last_name
from student s
full join parent p on s.last_name = p.last_name
where s.last_name is null or p.last_name is null;

-- cartesian product: product of both sets that results in all possible ordered pairs
drop table if exists table1;
create table if not exists table1(
	id SERIAL PRIMARY KEY,
	letter text
);
insert into table1(letter) values ('A'), ('B'), ('C');

drop table if exists table2;
create table if not exists table2(
	id SERIAL PRIMARY KEY,
	number integer
);
insert into table2(number) values (1), (2), (3);

SELECT * FROM table1;
SELECT * FROM table2;

select * from table1 a cross join table2 b;
select * from table1, table2;

-- natural join
SELECT * FROM table1 NATURAL JOIN table2;

-- inner join
SELECT * FROM table1 a INNER JOIN table2 b ON a.id = b.id;

-- set operations: when you want to use two different selects and combine results
drop table if exists food1;
create table if not exists food1(
	name text
);

insert into food1 values('Banana'), ('Orange'), ('Eggs'), ('Waffles'), ('Butter');

drop table if exists food2;
create table if not exists food2(
	name text
);

insert into food2 values('Pizza'), ('Orange'), ('Cheese'), ('Waffles'), ('Spaghetti');

SELECT * FROM food1;
SELECT * FROM food2;


select * from food1 union select * from food2; -- without duplicate
select * from food1 union all select * from food2; -- with duplicates

-- intersect: returns any rows that are available in both sets
select * from food1 intersect select * from food2;

-- except/minus: returns any rows that are unique to left query
select * from food1 except select * from food2;

-- views: provide a "saved" query to work with that acts like another table
 	-- create
create or replace view full_join_view as 
select s.first_name as student_first, s.last_name as student_last, p.first_name as parent_first, p.last_name as parent_last
from student s
full join parent p on s.last_name = p.last_name;

SELECT * FROM full_join_view;
drop view if exists full_join_view;

create index first_name_index on student(first_name);
EXPLAIN SELECT * FROM student WHERE first_name = 'Jessica';
drop index if exists first_name_index;

CREATE ROLE another_user
LOGIN
PASSWORD 'pass';


GRANT select -- INSERT, DELETE, UPDATE, etc, or ALL
ON student -- ON ALL TABLES IN SCHEMA name
TO another_user;

SELECT * FROM student;
SELECT * FROM parent;
DELETE FROM student;