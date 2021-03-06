package com.revature.controllers;

import com.revature.views.View;

public class Controller {
	
	public static void init() {
		// welcome message
		View.displayWelcome();
		
		// log in
		boolean isLoggedIn = View.displayLogin();
		
		while (isLoggedIn) {
			// view student records
			View.displayStudentRecords();
			// have user make decision
			int choice = View.displayTopMenu();
			switch (choice) {
			// 1) choose a student
			case 1:
					// delete student record
					// update student record
					// view parents
						// mark parent to call
						// go back
			// 2) add student records
			case 2:
				break;
			// quit
			case 3:
				isLoggedIn = false;
				break;
				default: System.out.println("Bad input!");
			}
		}

		
		// goodbye message
		View.displayGoodbye();
	}
}
