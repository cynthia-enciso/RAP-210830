package com.revature;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.revature.models.Student;
import com.revature.utils.BetterConnection;

public class JDBCPratice {
	public static void main(String[] args) {		
		
		// call getStudentNotPrepared()
//		Student student1 = getStudentNotPrepared("1; TRUNCATE TABLE student CASCADE; --");
//		System.out.println(student1);
		
		// call getStudentPrepared()
		Student student2 = getStudentPrepared(1);
		System.out.println(student2);
		
		callTruncateAll();
		
		System.out.println();
		
		// call getAllStudents()
		ArrayList<Student> students = getAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public static ArrayList<Student> getAllStudents() {
		ArrayList<Student> students = new ArrayList<>();
		
		try (Connection connection = BetterConnection.getConnection();
				Statement statement = connection.createStatement();){

			
			ResultSet rs = statement.executeQuery("SELECT s.*, st.type_name FROM student s, student_type st WHERE s.type_id = st.id;");
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				double gpa = rs.getDouble("gpa");
				boolean isDoingWell = rs.getBoolean("is_doing_well");
				Date graduation = rs.getDate("graduation");
				String type = rs.getString("type_name");
				
				students.add(new Student(id, firstName, lastName, gpa, isDoingWell, graduation, type));
			}
			
			// don't try to close your resources here
//			connection.close();
//			statement.close();
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			// cannot access locally scoped variables from try block
//			connection.close();
//			statement.close();
		}
		
		return students;
	}
	
	public static Student getStudentNotPrepared(String value) {
		Student student = new Student();
		
		try (Connection connection = BetterConnection.getConnection();
				Statement statement = connection.createStatement();) {
			
			String sql = "SELECT s.*, st.type_name FROM student s, student_type st WHERE s.type_id = st.id AND s.id = " + value;
			statement.execute(sql);
			ResultSet rs = statement.getResultSet();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				double gpa = rs.getDouble("gpa");
				boolean isDoingWell = rs.getBoolean("is_doing_well");
				Date graduation = rs.getDate("graduation");
				String type = rs.getString("type_name");
				
				student = new Student(id, firstName, lastName, gpa, isDoingWell, graduation, type);

			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		return student;
	}
	
	public static Student getStudentPrepared(int value) {
		Student student = new Student();
		String sql = "SELECT s.*, st.type_name FROM student s, student_type st WHERE s.type_id = st.id AND s.id = ?";
		try (Connection connection = BetterConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);) {
			
			statement.setInt(1, value);
			statement.executeQuery();
			ResultSet rs = statement.getResultSet();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				double gpa = rs.getDouble("gpa");
				boolean isDoingWell = rs.getBoolean("is_doing_well");
				Date graduation = rs.getDate("graduation");
				String type = rs.getString("type_name");
				
				student = new Student(id, firstName, lastName, gpa, isDoingWell, graduation, type);

			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		return student;
	}
	
	public static void callTruncateAll() {
		try  (Connection connection = BetterConnection.getConnection();
				CallableStatement cs = connection.prepareCall("SELECT truncate_all();");) {
			
			cs.execute();
			System.out.println("\nstudent table successfully truncated!");
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}
