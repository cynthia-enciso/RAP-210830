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
CREATE TABLE IF NOT EXISTS parent(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	is_in_need_of_call BOOLEAN
);

-- school table
CREATE TABLE IF NOT EXISTS school(
	id SERIAL PRIMARY KEY,
	name_of VARCHAR(250),
	address VARCHAR(250)
);

-- principal table
CREATE TABLE IF NOT EXISTS principal(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	user_name VARCHAR(50),
	user_password VARCHAR(50)
);
