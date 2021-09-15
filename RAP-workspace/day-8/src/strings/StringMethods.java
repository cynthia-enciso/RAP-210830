package strings;

public class StringMethods {
	public static void main(String[] args) {
		String myString = "Hello there, my name is Cynthia.";
		
		// charAt: returns a character
		System.out.println(myString.charAt(0));
		// if you want a string returned, you would need to convert
		String characterAsAString = String.valueOf(myString.charAt(0));
		String characterAsAString2 = Character.toString(myString.charAt(0));
		System.out.println(characterAsAString2);
		
		// indexOf: returns an int
		System.out.println(myString.indexOf('i'));
		System.out.println(myString.indexOf('k')); // not in string
		
		// length: returns an int
		System.out.println(myString.length());
		
		// substring: returns a NEW STRING
		// returns substring staring at first index, ending at second index (exclusively)
		String substring = myString.substring(0, 3);  
		System.out.println(substring);
		
		// contains: returns a boolean
		System.out.println(myString.contains("H")); // true
	}
}
