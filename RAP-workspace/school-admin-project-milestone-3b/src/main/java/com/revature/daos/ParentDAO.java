package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Parent;

public interface ParentDAO {

	// create
	public boolean addParent(Parent parent);
	
	// read 
	public ArrayList<Parent> getAllParents();
	public ArrayList<Parent> getParentsOfStudent(int id);
	public Parent getParent(int id);
	
	// update
	
	// delete
}
