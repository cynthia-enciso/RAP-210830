package examples;

public class Casting {
	public static void main(String[] args) {
		// upcasting 
		int myInt = 10;
		double myDouble = myInt; // implicit cast
		
		// downcasting
		double myOtherDouble = 30.0;
		int myOtherInt = (int) myOtherDouble; // explicit cast
		
		// weird results due to overflow
		int myLastInt = 200;
		byte myByte = (byte) myLastInt;
		System.out.println(myByte);
		
		// we know that characters are treated as numbers
		char myChar = 'a';
		System.out.println((int) myChar);
	}

}
