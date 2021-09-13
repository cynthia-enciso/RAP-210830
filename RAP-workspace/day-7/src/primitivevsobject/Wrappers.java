package primitivevsobject;

public class Wrappers {
	public static void main(String[] args) {
		// autoboxing: going from a primitive to its corresponding object class
		int myInt = 5;
		Integer myInteger = myInt;
		
		String myString = "5";
		Integer toIntFromString = Integer.parseInt(myString);
		System.out.println(toIntFromString);
		
		// unboxing: going from an wrapper class to a primitive
		int myOtherInt = toIntFromString;
	}
}
