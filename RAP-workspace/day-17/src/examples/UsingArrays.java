package examples;

import java.util.Arrays;

public class UsingArrays {
	public static void main(String[] args) {
		// create array
		int[] array = {42, 20, 5, 1, 34, 50, 2, 14, 86};
		
		// toString
		System.out.println(array);
		System.out.println("Before sort: " + Arrays.toString(array));
		
		// sort
		Arrays.sort(array);
		System.out.println("After sort: " + Arrays.toString(array));
		
		// binarySearch
		System.out.println(Arrays.binarySearch(array, 5));
	}
}
