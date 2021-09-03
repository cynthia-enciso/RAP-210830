package examples;

public class IfStatements {
	public static void main(String[] args) {
		boolean bool1 = false;
		int x = 5;
		
		// basic structure
		if (bool1) {
			System.out.println("bool1 was true");
		} else if (x < 1) {
			System.out.println("x was greater than 1");
		} else {
			System.out.println("no condition satisfied");
		}
		
		boolean value = false;
		
		// very confusing situation
		if (value = true) {
			System.out.println("value is true");
		} else {
			System.out.println("value is false");
		}
		
		// mutually exclusive
		int y = 3;
		
		if (y == 0) {
			System.out.println("y is 0");
		}  else if (y == 2) {
			System.out.println("y is 2");
		} else if (y >= 1 && y <= 5) {
			System.out.println("y is in the range 1-5");
		}
		else {
			System.out.println("y is not 0, 2, or 1-5");
		}
		
		// nested if statements
		int age = 12;
		boolean withParent = true;
		char movie = 'R';
		
		// check rating of movie
		if (movie == 'R') {
			// check their age
			if (age >= 18) {
				System.out.println("Enjoy the movie!");
			} 
			// check if they are with parent
			else if (withParent) {
				System.out.println("Enjoy the movie!");
			}
			// otherwise they can't go
			else {
				System.out.println("Sorry, you're too young!");
			}
		} else if (movie == 'T') {
			// check their age
			if (age >= 13) {
				System.out.println("Enjoy the movie!");
			} else if (withParent) {
				System.out.println("Enjoy the movie!");
			} else {
				System.out.println("Sorry, you're too young!");
			}
		} else {
			System.out.println("Enjoy the movie!");
		}
		
		// modulus example
		int myValue = 13;
		if (myValue % 2 == 0) {
			System.out.println("it is even");
		} else {
			System.out.println("it is odd");
		}
		
		// ternary operator
		String myString = myValue % 2 == 0 ? "it is even" : "it is odd";
//		System.out.println(myString);
		
		System.out.println(myValue % 2 == 0 ? "it is even" : "it is odd");
		
		// if you are not assigned the returned value to a variable
			// you can have different data types in your last two operands
		System.out.println(myValue % 2 == 0 ? "it is even" : false);
		
	}
}
