package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Parent;
import com.revature.models.Student;

public class StudentRepositoryImpl implements StudentRepository {

	private StudentDAO studentDAO = new StudentDAOImpl();
	private ParentDAO parentDAO = new ParentDAOImpl();
	
	@Override
	public Student getStudent(int id) {
		Student student = studentDAO.getStudent(id);
		ArrayList<Parent> parents = parentDAO.getParentsOfStudent(1);
		student.setParents(parents);
		return student;
	}

	@Override
	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> students = studentDAO.getAllStudents();
		
		for (Student student : students) {
			ArrayList<Parent> parents = parentDAO.getParentsOfStudent(student.getId());
			student.setParents(parents);
		}
		
		return students;
	}

	public static void main(String[] args) {
		// create repository object
		StudentRepository studentRepository = new StudentRepositoryImpl();
		
		// read from database
		Student student = studentRepository.getStudent(1);
		
		System.out.println(student);
		
	}
}
