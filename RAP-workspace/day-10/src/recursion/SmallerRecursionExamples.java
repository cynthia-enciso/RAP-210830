package recursion;

public class SmallerRecursionExamples {
	public static void main(String[] args) {
		System.out.println(fibonacci(2));
//		System.out.println(recursiveAddition(4, 5));
	}
	// O(2^n): problem of size N by recursively solving two smaller problems of size N-1.
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.
	// base cases: index same as value
	public static int fibonacci(int n) {
		// if index we pass in is 0, we get zero
		if (n == 0) {
			return 0;
		}
		// if index we pass in is 1, we get one
        if (n == 1) {
			return 1;
		}
        
        return fibonacci(n-1) + fibonacci(n-2);
	}
	
	// O(n) since one call
	public static int recursiveAddition(int x, int y) {
		// if we can no longer subtract x, y should be the sum of both numbers
		if (x == 0) {
			return y;
		} else {
			return recursiveAddition(--x, ++y);
		}
	}
}
