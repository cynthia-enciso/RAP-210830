package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.revature.models.Student;
import com.revature.utils.DAOUtility;

public class StudentDAOImpl implements StudentDAO {

	private Connection connection;
	private PreparedStatement statement;
	
	@Override
	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudent(int id) {
		Student student = new Student();
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "SELECT s.*, st.type_name FROM student s, student_type st WHERE s.id = ? AND s.type_id = st.id";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			
			// for each record (should just be one student)
			while (rs.next()) {
				// save property values
				int student_id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				double gpa = rs.getDouble("gpa");
				boolean isDoingWell = rs.getBoolean("is_doing_well");
				Date graduation = rs.getDate("graduation");
				String type = rs.getString("type_name");
				
				// add parent to parents arraylist
				student = new Student(student_id, firstName, lastName, gpa, isDoingWell, graduation, type);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeResources();
		}

		return student;
	}

	@Override
	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> students = new ArrayList<>();
		
		try {
			connection = DAOUtility.getConnection();
			String sql = "SELECT s.*, st.type_name FROM student s, student_type st WHERE s.type_id = st.id;";
			statement = connection.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			
			// for each record (should just be one student)
			while (rs.next()) {
				// save property values
				int student_id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				double gpa = rs.getDouble("gpa");
				boolean isDoingWell = rs.getBoolean("is_doing_well");
				Date graduation = rs.getDate("graduation");
				String type = rs.getString("type_name");
				
				// add parent to parents arraylist
				students.add(new Student(student_id, firstName, lastName, gpa, isDoingWell, graduation, type));
			}
		} catch(SQLException ex) {
			System.out.println("Error: Cannot get all students.");
			ex.printStackTrace();
		} finally {
			closeResources();
		}

		return students;
	}

	@Override
	public boolean updateStudentGPA(double gpa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	private void closeResources() {
		try {
			if (statement != null && !statement.isClosed()) {
				statement.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch(SQLException ex) {
			System.out.println("Error: Could not close resources.");
			ex.printStackTrace();
		}
	}
}
