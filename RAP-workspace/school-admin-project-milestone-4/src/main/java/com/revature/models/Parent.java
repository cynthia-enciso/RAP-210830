package com.revature.models;

public class Parent extends Person {

	// isInNeedOfCall
	private boolean isInNeedOfCall;

	public Parent(int id, String firstName, String lastName, boolean isInNeedOfCall) {
		super(id, firstName, lastName);
		this.isInNeedOfCall = isInNeedOfCall;
	}
	
	// getters and setters
	public boolean isInNeedOfCall() {
		return isInNeedOfCall;
	}

	public void setInNeedOfCall(boolean isInNeedOfCall) {
		this.isInNeedOfCall = isInNeedOfCall;
	}
	
	public String toString() {
		return this.getFirstName() + " | " + this.getLastName() + " | " + this.isInNeedOfCall;
	}
}
