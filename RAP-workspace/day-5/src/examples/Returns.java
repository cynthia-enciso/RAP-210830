package examples;

public class Returns {
	
	public static void main(String[] args) {
		int value = 0;
		
		value = sum(5, 4);
		
		System.out.println(value);
		
		System.out.println(sum(5, 4));
	}
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
}
