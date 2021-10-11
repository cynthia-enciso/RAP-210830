-- DDL/DML

/*
	DROP TABLE IF EXISTS table_name;

	CREATE TABLE IF NOT EXISTS table_name (
    	columnName datatype,
        column_name datatype,
        etc...
    );
    
    INSERT INTO table_name(column_names) VALUES(values);
    
	SELECT * FROM table_name;
*/


--GURU
CREATE TABLE IF NOT EXISTS books (
   book_id VARCHAR(20),
   title VARCHAR(50)
  );
  INSERT INTO Books (book_id, title)
VALUES (1,'Java for begginer');

  
--yash
create table if not exists vehicle (
	company VARCHAR(10),	-- toyota, ford, etc
	model VARCHAR(10),	-- exact model name of car
	vehicle_type VARCHAR(10),	-- sedan, suv, etc
	mileage INTEGER,
	horsepower INTEGER,
	automatic BOOLEAN	-- True if auto, false for manual
);
insert into vehicle (company, model, vehicle_type, mileage, horsepower, automatic)
values ('Toyota', 'Corolla', 'Sedan', 35, 125, True);


DROP TABLE IF EXISTS employee;
-- sahar
CREATE TABLE IF NOT EXISTS employee(
	employee_name varchar(50),
	employee_last_name varchar(50)
	
);
INSERT INTO employee (employee_name) VALUES('Sahar');

DROP TABLE IF EXISTS animals;

CREATE TABLE IF NOT EXISTS animals(
	animal_id SERIAL,
	animal_species VARCHAR(50),
	animal_name VARCHAR(100)
);

INSERT INTO animals(animal_id, animal_species, animal_name) 
VALUES(DEFAULt, 'Dog', 'Bobby');


--create table if not exists 

CREATE TABLE IF NOT EXISTS zoo(
  city VARCHAR(20),
   exhibits INTEGER,
  exhibits_name VARCHAR(20),
   animals VARCHAR(20),
    can_be_pet BOOLEAN
  
    );
    INSERT INTO zoo(city, exhibits_name, animals)
    VALUES ('San Diego', 'Big Cats',' tiger');

-- create a table
CREATE TABLE if NOT exists students (
  id INTEGER PRIMARY KEY,
  firstname TEXT NOT NULL,
  secondname TEXT NOT NULL,
  gender TEXT NOT NULL
  
);

INSERT INTO students VALUES (1, 'Gideon','Boot', 'M');

-- DQL

SELECT * FROM Books;
SELECT * FROM employee;
SELECT * FROM animals;
SELECT * FROM students;
SELECT * FROM zoo;
select * from vehicle;