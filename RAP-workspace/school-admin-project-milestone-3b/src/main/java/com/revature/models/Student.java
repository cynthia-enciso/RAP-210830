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
	
	
}
