package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.models.Parent;
import com.revature.utils.DAOUtility;

public class ParentDAOImpl implements ParentDAO {

	private Connection connection;
	private PreparedStatement statement;
	
	@Override
	public boolean addParent(Parent parent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Parent> getAllParents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Parent> getParentsOfStudent(int id) {
		ArrayList<Parent> parents = new ArrayList<>();
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "SELECT (p.*) FROM parent p, student_parent sp where sp.student_id = ? AND sp.parent_id = p.id;";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			// for each record (parent)
			while (rs.next()) {
				// save property values
				int parent_id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				boolean isInNeedOfCall = rs.getBoolean("is_in_need_of_call");
				
				// add parent to parents arraylist
				parents.add(new Parent(parent_id, firstName, lastName, isInNeedOfCall));
			}
		} catch(SQLException ex) {
			System.out.println("Error: Cannot get student's parents.");
			ex.printStackTrace();
		}
		
		return parents;
	}

	@Override
	public Parent getParent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	private void closeResources() {
		try {
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
		} catch(SQLException ex) {
			System.out.println("Error: Could not close resources.");
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ParentDAO parentDAO = new ParentDAOImpl();
		
		ArrayList<Parent> parents = parentDAO.getParentsOfStudent(1);
		
		for (Parent parent : parents) {
			System.out.println(parent);
		}
	}
}
