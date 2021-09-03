package examples;

public class CommonOperators {
	public static void main(String[] args) {
		// creating some data to use
		int int1 = 5;
		int int2 = 4;
		int int3 = 12;
		int int4 = 5;
		
		double double1 = 5.0;
		double double2 = 4.0;
		double double3 = 12.0;
		
		String string1 = "5";
		String string2 = "cat";
		String string3 = "cat";
		String string4 = new String("cat");
		
		// arithmetic operators
		System.out.println("---------- ADDITION ------------");
		System.out.println(int1 + int2);
		// with strings, if you try to use +, concatenation occurs
		System.out.println(int1 + string1);
		int parsedInt = Integer.parseInt(string1);
		System.out.println(int1 + parsedInt);
		System.out.println(int1 + double1);
		
		System.out.println("---------- DIVISION ------------");
		// division
		System.out.println(int3 / int1);
		System.out.println(double3 / double1);
		
		// modulus: returns the remainder
		System.out.println(int3 % int1); // remainder 2 (5 goes in 12 twice with two left over)
		
		// conditional operators
			// relational: >, <, >=, <=
			// equality: ==, !=
		System.out.println(5 >= 5); // true
		System.out.println(int1 == int4);
		System.out.println(int1 == double1);
		
		// objects can sometimes not work as expected with the ==
		System.out.println(string2 == string3); // true
		System.out.println(string2); // cat
		System.out.println(string4); // cat
		System.out.println(string2 == string4); // false
		
		System.out.println("---------- Prefix/Postfix Operators ------------");
		// prefix and postfix operators
		int myValue = 6;
		
		// postfix increment operator: returns original value and then increments
//		System.out.println(myValue++);
//		System.out.println(myValue);
		
		// prefix increment operator: increments and then returns new value
		System.out.println(++myValue);
		
		System.out.println("---------- Precendence ------------");
		System.out.println("my string plus " + 5 + 5);
		System.out.println(5 + 5 + " and then my string");
		System.out.println("my string plus " + (5 + 5));
		System.out.println("my string plus" + 5 * 5);
	}
}
