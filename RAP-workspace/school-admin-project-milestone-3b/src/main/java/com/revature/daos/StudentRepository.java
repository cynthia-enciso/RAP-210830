package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Student;

public interface StudentRepository {
	
	// read
	public Student getStudent(int id);
	
	public ArrayList<Student> getAllStudents();
}
