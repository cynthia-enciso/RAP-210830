package bigoexamples;

public class BigOExamples {
	// O(1): constant, the input size does not affect the runtime
	public static void print(String[] input) {
		
		// checking if it is an array that has at least one element
		if (input != null && input.length > 0) { // 1
			// printing to the console
			System.out.println("it is an array that has elements"); // 1
		} else {
			// printing to the console
			System.out.println("it is empty"); // 1
		}
		
		// complexity:  1 + 1 + 1 + 1
	}
	
	// O(n): linear, the input size matters
	public static void printAll(String[] input) {
		
		// iterating over array
		for (String element : input) { // n
			System.out.println(element); // 1
		}
		
		// complexity: n + 1
	}
	
	// O(n^2): quadratic, nested loops are a good indicator of this
	public static void printIntMultiplication(int[] input) {
		
		// for every element
		for (int element : input) { // n
			// multiply it by every element
			for (int currentElement : input) { // n
				System.out.println(element * currentElement); // 1
			}
		}
		
		// complexity:  n * n + 1
		//				n^2 + 1
	}
}
