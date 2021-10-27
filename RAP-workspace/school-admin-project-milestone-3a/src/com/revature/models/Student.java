package com.revature.models;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {
	// fields
	private double gpa;
	private boolean isDoingWell;
	private ArrayList<Parent> parents;
	private Date graduation;
	private String type;

	public Student() {
		super(0, null, null);
	}
	
	// NEW: created constructor
	public Student(int id, String firstName, String lastName, double gpa, boolean isDoingWell, Date graduation, String type) {
		super(id, firstName, lastName);
		this.gpa = gpa;
		this.isDoingWell = isDoingWell;
		this.graduation = graduation;
		this.type = type;
	}
	
	// getters and setters
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public boolean isDoingWell() {
		return isDoingWell;
	}

	public void setDoingWell(boolean isDoingWell) {
		this.isDoingWell = isDoingWell;
	}

	public ArrayList<Parent> getParents() {
		return parents;
	}

	public void setParents(ArrayList<Parent> parents) {
		this.parents = parents;
	}

	public Date getGraduation() {
		return graduation;
	}

	public void setGraduation(Date graduation) {
		this.graduation = graduation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return this.getFirstName() + " | " + this.getLastName() + " | " + this.gpa + " | " + this.isDoingWell + " | " + this.graduation + " | " + this.type + " | " + this.parents;
	}
}
