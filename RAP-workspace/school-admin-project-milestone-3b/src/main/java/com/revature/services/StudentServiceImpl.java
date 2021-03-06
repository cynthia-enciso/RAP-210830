package com.revature.services;

import java.util.ArrayList;

import com.revature.daos.StudentRepository;
import com.revature.daos.StudentRepositoryImpl;
import com.revature.models.Student;
import com.revature.views.View;

public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository = new StudentRepositoryImpl();
	
	public int getDoingWellCount() {
		// create count variable
		int count = 0;
		
		// get students
		ArrayList<Student> students = studentRepository.getAllStudents();
		
		// check if each student is doing well
		for (Student student : students) {
			// make decision
			if (student.isDoingWell()) {
				count++;
			}
		}
		
		// return count
		return count;
	}
}
