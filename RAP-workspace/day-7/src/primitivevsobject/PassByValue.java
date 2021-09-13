package primitivevsobject;

import java.util.Arrays;

public class PassByValue {
	public static void main(String[] args) {
		// initializing variables
		int primitive = 5;
		
		
		// calling a method
		manipulateValue(primitive);
		
		
		// checking value of variable
		System.out.println("Original variable's value after method call: " + primitive);
	}
	
	public static void manipulateValue(int x) {
		x = 10;
		System.out.println("Local variable's value inside of method: " + x);
	}
	
	
}
