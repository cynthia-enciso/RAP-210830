package examples;

public class AnotherExample {
	public static void main(String[] args) {
		// an example where we pass along data from one method to another
		int value = 0; // first value
		
		value = addTwo(value);
	}
	
	public static int addTwo(int a) {
		int newValue = a + 2;
		return newValue;
	}
	
	public static int[] anotherMethod(int a, int b) {
		return new int[] {a, b};
	}
	
	public static void takeInArray(int[] array) {
		
	}
}
