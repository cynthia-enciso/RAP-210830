package examples;

public class Overloading {
	public static void main(String[] args) {
		String name = "Cynthia";
		String hairColor = "Brown";
		String gender = "female";
		
		print(name, hairColor);
		print("word", 5);
		print(5, "word");
	}
	
	public static void print() {
		System.out.println("print called");
	}
	
	public static void print(String a) {
		System.out.println("print was called with the string: " + a);
	}
	
	public static void print(int a) {
		System.out.println("print was called with the int: " + a);
	}
	
	public static void print(String a, int b) {
		System.out.println("print was called with the string: " + a + "and the int: " + b);
	}
	
	public static void print(int b, String a) {
		System.out.println("print was called with the string: " + a + "and the int: " + b);
	}
	
	public static void print(String name, String hairColor) {
		System.out.println("My name is: " + name + " and my hair is " + hairColor);
	}
	
	// this overloaded method signature is technically same as the one above. won't work.
//	public static void print(String name, String gender) {
//		System.out.println("My name is: " + name + " and my gender is " + hairColor);
//
//	}
	
	
}
