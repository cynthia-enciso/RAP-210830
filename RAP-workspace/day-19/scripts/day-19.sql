-- single-line
/*
 * multi-line
 * 
 */
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS parent;
DROP TABLE IF EXISTS school;
DROP TABLE IF EXISTS principal;

CREATE TABLE IF NOT EXISTS student(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	gpa NUMERIC,
	is_doing_well BOOLEAN
);

ALTER TABLE student ADD COLUMN graduation DATE;

-- parent table
CREATE TABLE parent(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	is_in_need_of_call BOOLEAN
);

-- school table
CREATE TABLE school(
	id SERIAL PRIMARY KEY,
	name_of VARCHAR(250),
	address VARCHAR(250)
);

-- principal table
CREATE TABLE principal(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	user_name VARCHAR(50),
	user_password VARCHAR(50)
);

-- DDL
--TRUNCATE student; -- keeps the table, removes every record
--DROP TABLE student; -- removes the table and its records

-- create metadata about table
COMMENT ON TABLE student IS 'Information about students.';
-- remove comment
COMMENT ON TABLE student IS NULL;

-- rename table
--ALTER TABLE student RENAME TO otherstudent;
--ALTER TABLE otherstudent RENAME TO student;

-- rename column
--ALTER TABLE student RENAME gpa to pga;
--ALTER TABLE student RENAME pga to gpa;

-- DML

-- READ
SELECT * FROM student;  

INSERT INTO student VALUES
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
	(default, 'Alma', 'James', 3.5, default, '08/04/2010');

INSERT INTO student(first_name, last_name, gpa, graduation) VALUES('Jillian', 'Fredrickson', 1.5, '10/03/2001');

-- CREATE 
UPDATE student SET is_doing_well = (gpa > 2.0);
	
SELECT * FROM student; -- READ 