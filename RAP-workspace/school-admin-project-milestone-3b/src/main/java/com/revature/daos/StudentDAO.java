package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Student;

public interface StudentDAO {

	// create
	public boolean addStudent(Student student);
	
	// read 
	public Student getStudent(int id);
	
	public ArrayList<Student> getAllStudents();
	
	// update
	public boolean updateStudentGPA(double gpa);
		// other updates...
	
	// delete
	public boolean removeStudent(int id);
}
