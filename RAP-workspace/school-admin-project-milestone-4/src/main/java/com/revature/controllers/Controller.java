package com.revature.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.views.View;

public class Controller {

	private static final Logger LOG = LogManager.getLogger(Controller.class);
	
	public static void init() {
		LOG.trace("Started init()");
		// welcome message
		View.displayWelcome();
		
		// log in
		boolean isLoggedIn = View.displayLogin();
		
		while (isLoggedIn) {
			LOG.trace("Inside top menu loop");
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
			
			// debugging
			LOG.debug("is user still logged in: " + isLoggedIn);
			LOG.trace("exit top menu loop");
		}

		
		// goodbye message
		View.displayGoodbye();
		LOG.trace("Ended init()");
	}
}
