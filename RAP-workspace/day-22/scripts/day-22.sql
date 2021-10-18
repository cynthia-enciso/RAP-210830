--- tcl: transaction control language, manages changes made by DML statements
	-- begin
	-- savepoint
	-- rollback
	-- commit

BEGIN;
SELECT * FROM student;
COMMIT;

BEGIN;
-- change #1, was Geoff
UPDATE student SET first_name = 'Mike' WHERE id = 4;
-- change #2, was Jessica
UPDATE student SET first_name = 'Jamie' WHERE id = 2;
SAVEPOINT my_savepoint;
-- change #3, was Fabian
UPDATE student SET first_name = 'Carlos' WHERE id = 1;
--ROLLBACK TO my_savepoint;
--ROLLBACK;
-- change #4, was Wanda
UPDATE student SET first_name = 'Poppy' WHERE id = 3;
COMMIT;


-- pl/pgSQL: procedural language (working with data through subroutines) 
-- that allows you to extend functionality of postgres by creating
	-- functions
	-- stored procedures
	-- triggers
	-- and adding control structures (if, case, loops)

-- functions are used to have a callable code block (but no modifying of data)
	-- so for returning a value from another function or a query

-- create function
CREATE OR REPLACE FUNCTION student_count()
RETURNS INTEGER
LANGUAGE plpgsql AS
$$
-- declare any variables you would like to use
DECLARE
	student_count INTEGER = 0;
BEGIN
	SELECT COUNT(*) INTO student_count FROM student;
	RETURN student_count;
END;
$$

-- call function
SELECT student_count();

-- drop function
DROP FUNCTION IF EXISTS student_count();

-- more useful function example:
CREATE OR REPLACE FUNCTION TRUNCATE_all()
RETURNS VOID
LANGUAGE plpgsql AS 
$$
BEGIN
		-- TRUNCATE TABLEs
	TRUNCATE TABLE student RESTART IDENTITY CASCADE;
	TRUNCATE TABLE parent RESTART IDENTITY CASCADE;
	TRUNCATE TABLE student_parent CASCADE;
	TRUNCATE TABLE student_type RESTART IDENTITY CASCADE;
	TRUNCATE TABLE school RESTART IDENTITY CASCADE;
	TRUNCATE TABLE principal RESTART IDENTITY CASCADE;
END;
$$

SELECT * FROM student;
SELECT * FROM parent;
SELECT * FROM student_parent;
SELECT * FROM student_type;
SELECT * FROM school;
SELECT * FROM principal;

SELECT truncate_all();

---- sequence
CREATE SEQUENCE IF NOT EXISTS my_positive_sequence
AS INTEGER -- smallint, int, bigint(default)
INCREMENT 1
NO MINVALUE
MAXVALUE 10
START WITH 5;

SELECT NEXTVAL('my_positive_sequence');

DROP SEQUENCE IF EXISTS my_positive_sequence;

CREATE TABLE IF NOT EXISTS new_table(
	id INTEGER
);

CREATE SEQUENCE IF NOT EXISTS my_negative_sequence
AS INTEGER
INCREMENT -1
OWNED BY new_table.id;

INSERT INTO new_table VALUES(NEXTVAL('my_negative_sequence'));
SELECT * FROM new_table;

CREATE TABLE IF NOT EXISTS another_new_table(
	id INTEGER DEFAULT NEXTVAL('my_positive_sequence')
);

INSERT INTO another_new_table VALUES(default);
SELECT * FROM another_new_table;

-- trigger: function invoked when an event associated with a table occurs
	-- events: insert, update, delete or truncate
	-- two types: row level: for every row affected, the trigger happens that many times
	-- 			  statement level: runs once
	-- can run before or after the event

CREATE OR REPLACE FUNCTION insert_trigger_func()
RETURNS TRIGGER
LANGUAGE plpgsql AS
$$
BEGIN
	RAISE NOTICE 'record added!';
	RETURN NEW;
END;
$$

CREATE TRIGGER insert_trigger
AFTER INSERT ON parent
FOR EACH ROW 
EXECUTE PROCEDURE insert_trigger_func();

INSERT INTO parent VALUES(default, 'Lisa', 'Green', false);

CREATE OR REPLACE PROCEDURE update_is_doing_well(val INT)
LANGUAGE plpgsql AS
$$
BEGIN
	UPDATE student SET is_doing_well = (gpa > 2) WHERE id = val;
END;
$$

CREATE OR REPLACE FUNCTION student_insert_trigger()
RETURNS TRIGGER
LANGUAGE plpgsql AS
$$
BEGIN
	CALL update_is_doing_well(NEW.id);
	RETURN NEW;
END
$$

CREATE TRIGGER student_insert_trigger
AFTER INSERT ON student
FOR EACH ROW
EXECUTE FUNCTION student_insert_trigger();

INSERT INTO student(first_name, last_name, gpa, graduation) VALUES ('Jeff', 'Klondike', 3.5, '2022-03-15');
SELECT * FROM student;

-- CALL name_of_procedure();
