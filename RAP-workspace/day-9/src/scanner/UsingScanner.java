package scanner;

import java.util.Scanner;

public class UsingScanner {
	
	// JVM starts up three streams for you vs making any yourself:
	// System.in, System.out, System.err
	// these are for receiving input, showing output to the console.
	// system.err: makes your code red to make it more obviously an error
	// JVM is also responsible for closing these streams
	
	
	public static void main(String[] args) {
		// you would use this with exception handling
//		System.err.println("This is an error message!");
				
		// create scanner object to receive input from console
		Scanner scanner = new Scanner(System.in);
		
		// prompt user for input
		System.out.println("Please enter a number: ");
		
		// wait for user input
//		int input = scanner.nextInt();
//		
//		// work with value received
//		System.out.println(input);
//		
		
		
		// scanner also takes in strings
//		String myString = "Hello there, my name is Cynthia";
//		
//		scanner = new Scanner(myString);
//		
//		while (scanner.hasNext()) {
//			System.out.println(scanner.next());
//		}
//		
		
		System.out.println("Please enter some input. To stop, type \"quit\": ");
		
		while(scanner.hasNextLine()) {
			String nextLine = scanner.nextLine();
			System.out.println(nextLine);
			
			// ==
			if (nextLine.equals("quit")) {
				break;
			}
		}
		
		// close resource when finished
		scanner.close();
	}
}
