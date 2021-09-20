package sorting;

import java.util.Arrays;

public class IterativeSortingExamples {
	public static void main(String[] args) {
		int[] array = {52, 33, 99, 20, 11,55};
//		bubbleSort(array);
//		System.out.println(Arrays.toString(array));
		
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	// bubbleSort: O(n^2)
	public static void bubbleSort(int[] array) {
		// outer loop
		for (int i = 0; i < array.length - 1; i++) {	
			System.out.println("OUTERLOOP:Array is currently: "+ Arrays.toString(array));
			// inner loop
			for (int j = 0; j < array.length - i - 1; j++) {
				// if current element is larger than next element
				if (array[j] > array[j + 1]) {
					// swap array[j+1] and array[i] 
					System.out.println("Swapping "+(j+1)+":"+ array[j+1]+" "+j+":"+array[j]);
					int temp = array[j]; 
					array[j] = array[j+1]; 
					array[j+1] = temp; 
					System.out.println("Array is currently: "+Arrays.toString(array));
				}
			}
			
		}
	}
	
	// selectionSort: O(n^2)
	public static void selectionSort(int[] arr) {
		// outer loop
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			
			// inner loop
			for (int j = i + 1; j < arr.length; j++) {
				// if the value at j is less than current minimum value
				if (arr[j] < arr[minIndex]) {
					// change minimum index
					minIndex = j;
				}
			}
			
			// swap the value at the current index and the index of
				// the smallest value
				int larger = arr[i]; // save either the older or the larger value
				arr[i] = arr[minIndex]; // move the smaller value forward
				arr[minIndex] = larger; // move the larger value back
		}
	}
}
