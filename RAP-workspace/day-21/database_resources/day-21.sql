-- create tables and constraints
DROP TABLE IF EXISTS student CASCADE;
DROP TABLE IF EXISTS student_type CASCADE;
DROP TABLE IF EXISTS parent CASCADE;
DROP TABLE IF EXISTS student_parent CASCADE;
DROP TABLE IF EXISTS school CASCADE;
DROP TABLE IF EXISTS principal CASCADE;

CREATE TABLE IF NOT EXISTS student(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	gpa NUMERIC CHECK (gpa > 0),
	is_doing_well BOOLEAN,
	graduation DATE,
	type_id INTEGER,
	school_id INTEGER
	-- many to many with parents
);


CREATE TABLE student_type(
	id SERIAL PRIMARY KEY,
	type_name VARCHAR(50),
	description VARCHAR(250)
);

ALTER TABLE student 
ADD CONSTRAINT student_student_type_fkey
FOREIGN KEY (type_id)
REFERENCES student_type(id);

-- parent table
CREATE TABLE parent(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	is_in_need_of_call BOOLEAN
	-- many to many with students
);

-- many-to-many junction table (bridge, join)
CREATE TABLE student_parent (
	student_id INTEGER REFERENCES student(id),
	parent_id INTEGER REFERENCES parent(id),
	PRIMARY KEY (student_id, parent_id)
);

-- school table
CREATE TABLE school(
	id SERIAL PRIMARY KEY,
	school_name VARCHAR(250),
	address VARCHAR(250),
	principal_id INTEGER,
	UNIQUE (school_name, address)
);

-- one-to-many relationship
-- many students, one school
ALTER TABLE student 
ADD CONSTRAINT student_school_fkey -- FK_student_school
FOREIGN KEY (school_id)
REFERENCES school(id);

-- principal table
CREATE TABLE principal(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	user_name VARCHAR(50),
	user_password VARCHAR(50),
	school_id INTEGER REFERENCES school(id)
);

ALTER TABLE school 
ADD CONSTRAINT school_principal_fkey
FOREIGN KEY (principal_id)
REFERENCES principal(id) ON DELETE SET NULL;

-- populate tables
-- create a principal for school
INSERT INTO principal VALUES (default, 'Janet', 'Mills', 'jm1972', 'password', null);

-- create a school, assign principal
INSERT INTO school VALUES (default, 'West Lake Middle School', '22222 This Street Dr', 1);

-- assign school to principal
update principal set school_id = 1 where id = 1;

-- create some parents
INSERT INTO parent(first_name, last_name, is_in_need_of_call) 
VALUES 	('Bob', 'Smith', default),
		('Wanda', 'Smith', default),
		('Bryan', 'James', default),
		('William', 'James', default),
		('Amanda', 'Baxter', default),
		('Jerry', 'Baxter', default);
						
-- create some student types
	-- id, title, description
INSERT INTO student_type(type_name, description) VALUES 
							('Freshman', 'first year student'),
							('Sophmore', 'second year student'),
							('Junior', 'third year student'),
							('Senior', 'fourth year student')
;
-- create some students
INSERT INTO student(first_name, last_name, gpa, is_doing_well, graduation, type_id, school_id) VALUES
							('Fabian', 'Smith', 4.0, default, '03/25/2011', 1, 1),
							('Jessica', 'Smith', 3.0, default, '01/15/1995', 4, 1),
							('Wanda', 'Smith', 4.0, default, '12/10/2011', 2, 1),
							('Geoff', 'James', 2.5, default, '09/22/2020', 3, 1),
							('Rodrigo', 'James', 4.0,  default, '03/25/2011', 2, 1),
							('Patricia', 'Baxter', 3.0, default, '03/25/2011', 4, 1),
							('Kelly', 'Baxter', 3.5, default, '04/01/2012', 1, 1),
							('Tim', 'Baxter', 2.0,  default, '03/25/2012',1, 1),
							('Tom', 'Baxter', 1.5, default, '04/20/2001',3, 1),
							('Francis', 'Baxter', 1.0, default, '03/18/2000', 2 , 1);
						
-- update boolean VALUES
UPDATE student SET is_doing_well = (gpa > 2);

-- map the students to parents
INSERT INTO student_parent VALUES 	(1, 1),
								  	(1, 2),
									(2, 1),
									(2, 2),
									(3, 1),
									(3, 2),
									(4, 3),
									(4, 4),
									(5, 3),
									(5, 4),
									(6, 5),
									(6, 6),
									(7, 5),
									(7, 6),
									(8, 5),
									(8, 6),
									(9, 5),
									(9, 6),
									(10, 5),
									(10, 6);
									
-- view all tables
SELECT * FROM student;
SELECT * FROM student_type;
SELECT * FROM parent;
SELECT * FROM student_parent;
SELECT * FROM school;
SELECT * FROM principal;