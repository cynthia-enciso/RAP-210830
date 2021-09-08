package examples;

public class Varargs {
	// rules for varargs:
		// must be LAST parameter
		// must only have one in a method parameter list
	public static void main(String[] args) {
		printItems();
		printItems(1, 2, 3);
		printItems(new int[] {4, 5, 6});
		
		printOtherItems("hello", 10, 1, 2, 3, 4, 5);
		
		takeInArray(new int[] {1, 2, 3});
		
		printWords("hello", "world");
	}
	
	// can take in separate parameters of the type specified
	// can take in an array of the type specified
	// can take in nothing
	public static void printItems(int... array) {
		for (int element : array) {
			System.out.println(element);
		}
		
//		System.out.println(array[0]); // ArrayIndexOutOfBoundsException when called with no params
		
		if (array.length > 0) {
			System.out.println("first element: " + array[0]);
		}
	}
	
	public static void printOtherItems(String word, double b, int... array) {
		
	}
	
	// just takes in an int array
	public static void takeInArray(int[] array) {
		
	}
	
	public static void printWords(String...strings) {
		
	}
}
