package examples;

public class Parameters {
	// globally accessible variable
//	public static int x = 5;
	
	// local scope
	public static void main(String[] args) {
		int x = 10;
		
		printX(x);
		
		System.out.println("value of x after printX method was called: " + x);
	}
	
	// local scope
	public static void printX(int x) {
		x = 20;
		System.out.println("value of x in printX method: " + x);
	}
}
