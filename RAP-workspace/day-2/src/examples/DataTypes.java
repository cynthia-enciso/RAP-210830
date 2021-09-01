package examples;

public class DataTypes {
	// default values: only for variables declared outside of a method
	static int myDefaultInt;
	static int myDefaultDouble;
	static char myDefaultChar;
	static boolean myDefaultBool;
	
	// main method
	public static void main(String[] args) {
		// default values printed to console
		System.out.println(myDefaultInt);
		System.out.println(myDefaultDouble);
		System.out.println(myDefaultChar);
		System.out.println(myDefaultBool);
		
		// boolean
			// declaring
		boolean myBool;
		
			// initialization
		myBool = true;
		
		// numbers
			// byte - 1 byte
			// in exponents: 2 possible values and there are 8 bits. 
			//total values that can be represented is 2^8.
		double byteUniqueValues = Math.pow(2, 8); // 256 unique values
		// -128 - 127
		byte myMinByte = -128;
		byte myMaxByte = 127;
		
		// short - 2 bytes
		double shortUniqueValues = Math.pow(2, 16); // 65_536 unique values
		// -32_768 - 32_767
		short myMinShort = -32_768;
		short myMaxShort = 32_767;
		
		// int - 4 bytes
		// default whole number data type
		int myMinInt = -2_147_483_648;
		int myMaxInt = 2_147_483_647;
		
		// long - 8 bytes
		long myMinLong = -9_223_372_036_854_775_808L;
		long myMaxLong = 9_223_372_036_854_775_807L;
		
		// decimal numbers
		// float - 4 bytes 
		float myFloat =  5.55555555555555555F;
		
		// double - 8 bytes 
		double myDouble = 5.55555555555555555D; 
		
		System.out.println(myFloat);
		System.out.println(myDouble);
		
		// char - 2 bytes / range is from 0 to 65,535
		char myChar = 'a';
		char myOtherChar = 89;
		System.out.println(myChar);
		System.out.println(myOtherChar);
		
		for (char letter = 'a'; letter <= 'z'; letter++) {
			System.out.println(letter);
		}
		
		
	}
}
