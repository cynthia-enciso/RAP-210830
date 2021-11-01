package com.revature.views;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.StudentRepository;
import com.revature.daos.StudentRepositoryImpl;
import com.revature.models.Student;
import com.revature.services.StudentService;
import com.revature.services.StudentServiceImpl;

public class View {
	private static final Scanner scanner = new Scanner(System.in);
	private static StudentRepository studentRepository = new StudentRepositoryImpl();
	private static StudentService studentService = new StudentServiceImpl();
	private static final Logger LOG = LogManager.getLogger(View.class);
	public static void displayWelcome() {
		System.out.printf("==============================================="
				+ "\n Welcome to Generic College's Admin Dashboard!\n\n");
	}
	
	public static boolean displayLogin() {
		System.out.println("Username: ");
		String username = scanner.nextLine();
		System.out.println("Password: ");
		scanner.nextLine();
		System.out.println("Welcome back, " + username + "\n");
		return true;
	}
	
	public static void displayStudentRecords() {
		System.out.printf("\n==================== Current Students  =====================\n");
		ArrayList<Student> students = studentRepository.getAllStudents();
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		displayDoingWellCount();
		System.out.printf("============================================================\n");
	}
	
	public static void displayDoingWellCount() {
		int count = studentService.getDoingWellCount();
		System.out.printf("%nCount of students doing well: %d%n", count);
	}
	
	public static int displayTopMenu() {
		System.out.printf("\n"
				+ "1) Choose student by first and last name \n"
				+ "2) Add a student\n"
				+ "3) Quit\n");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public static void displayGoodbye() {
		System.out.printf("\n Logging out and exiting system. \n"
				+ "===============================================\n\n");
	}
}
