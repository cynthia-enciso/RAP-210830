package com.revature.services;

import com.revature.models.Student;

public class AnotherService {
	
	private AService aService = new AService();
	
	public double getGPAOfStudentReturned(int index, Student[] students) {
		Student student = aService.getStudentFromArray(index, students);
		return student.getGpa();
	}

	public AService getaService() {
		return aService;
	}

	public void setaService(AService aService) {
		this.aService = aService;
	}
	
	
}
