package examples;

public class LogicalOperators {
	public static void main(String[] args) {
		// & and | and ^, when used with boolean data types are logical operators
			// when used with numbers: bitwise operations occur
		// && and || are short circuit operators and can only be used in boolean context
		
		// !: logical not - works only with booleans
		boolean myBool = true;
		System.out.println(!myBool);
		
		// &, |, ^
		boolean bool1 = false;
		boolean bool2 = false;
		
		System.out.println(bool1 & bool2); // logical AND
		System.out.println(bool1 | bool2); // logical OR
		System.out.println(bool1 ^ bool2); // logical XOR
		System.out.println(!(bool1 ^ bool2)); // logical XAND
		
		// && (guard operator) and || (default operator)
		if (bool2 && methodThatReturnsBoolean()) {
			System.out.println("both operands returned true");
		} else {
			System.out.println("one operand was false");
		}
		
		// avoiding a NullPointerException
		String myString = null;
		boolean someoneGreetedMe = false;
		
		if (someoneGreetedMe) {
			myString = "hello";
		} else {
			myString = null;
		}
		
		if (myString != null && myString.charAt(0) == 'h') {
			System.out.println("first letter is an h!");
		} else {
			System.out.println("first letter is not an h!");
		}
		
	}
	
	public static boolean methodThatReturnsBoolean() {
		System.out.println("method was evaluated!");
		return true;
	}
}
