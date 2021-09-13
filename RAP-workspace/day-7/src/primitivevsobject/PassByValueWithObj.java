package primitivevsobject;

import java.util.Arrays;

public class PassByValueWithObj {
	public static void main(String[] args) {
		// initializing a variable
		int[] obj = {1, 2, 3, 4, 5};
		
		// calling a method
		manipulateValue(obj);
		
		// check original value
		System.out.println("Original variable's values after method call: " + Arrays.toString(obj));
	}
	
	public static void manipulateValue(int[] x) {
		x[0] = 10;
		System.out.println("Local variable's new values: " + Arrays.toString(x));
	}
}
