package strings;

public class Formatting {
	public static void main(String[] args) {
		/* String formatting
		 * 
		 * create a string:
		 * String.format("%[argument_index$][flags][width][.precision]conversion character", arguments);
		 * OR
		 * print to console:
		 * System.out.printf("%[argument_index$][flags][width][.precision]conversion character", arguments); 
		 * System.out.format("%[argument_index$][flags][width][.precision]conversion character", arguments);
		 * 
		 * Argument Index (optional)
		 * specify which argument is being used in which place 
		 * 
		 * Flag (optional)
		 * modify the output format 
		 * 
		 * Width (optional)
		 * specify how many characters it should contain
		 * 
		 * Precision (optional)
		 * for decimal numbers, how many decimal places it should have
		 * 
		 * Conversion Characters:
		 * d = whole number
		 * f = decimal number
		 * e = decimal number in scientific notation
		 * s = string or other java object
		 * b = boolean
		 * c = char
		 * n = newline
		 *  and more!
		 * 
		 */
		
		// using argument index
		System.out.format("%2$d%n", 1, 2, 3, 4); // not zero indexed!
		System.out.format("this is my string: %s and this is my number: %d%n", "hello", 5);
//		System.out.format("this is my string: %s and this is my number: %d%n", 5, "hello"); // doesn't work
		System.out.format("this is my string: %2$s and this is my number: %1$d%n", 5, "hello");
		
		// precision
		System.out.printf("%.2f%n", 3.66742644); // rounds
		// width, precision
		System.out.printf("%20.5f%n", 140.66342644); // spaces in total and number after		

		// just a conversion character
		System.out.printf("|%d|%n", 100);
		// width, conversion character
		System.out.printf("|%10d|%n", 100); // needs to take up ten spaces, right justified
		// flag, width, conversion character
		System.out.printf("|%-10d|%n", 100); // needs to take up ten spaces, left justified
		// flag, width, conversion character
		System.out.printf("|%010d|%n", 100); // needs to take up ten spaces, empty spaces filled with zeros
		// flag, width, conversion character
		System.out.printf("|%+10d|%n", 100); // needs to take up ten spaces, needs to show sign
		System.out.printf("|%+10d|%n", -100); // needs to take up ten spaces, needs to show sign
		System.out.printf("|%(10d|%n", -100); // needs to take up ten spaces, negative numbers are in parenthesis
		// flag, conversion character
		System.out.printf("|%,d|%n", 100000); // add commas
	}
}
