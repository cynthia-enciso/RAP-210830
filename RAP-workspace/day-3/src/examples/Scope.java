package examples;


public class Scope {
	
	// global scope
	public static int value = 1;
	
	
	// method: local scope
	public static void main(String[] args) {
		
		// block scope
		if (true) {
			int value = 3;
			int value2 = 10;
			System.out.println(value);
		}
		
		int value = 4;
		
//		System.out.println(value2);
		System.out.println(value);
	}
}
