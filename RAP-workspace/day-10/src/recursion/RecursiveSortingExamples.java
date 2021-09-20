package recursion;

import java.util.Arrays;

public class RecursiveSortingExamples {
	// divide and conquer:
		// divide problem into subproblems
		// solve subproblems
		// combine solutions
	
	public static void main(String[] args) {
		int[] unsorted = {4, 20, 9, 14, 2, 18, 6, 12};
		int[] mergeSorted = mergeSort(unsorted, 0, unsorted.length - 1);
		System.out.println(Arrays.toString(mergeSorted));
		
		quickSort(unsorted, 0, unsorted.length - 1);
		System.out.println(Arrays.toString(unsorted));
	}
	
	// mergeSort: O(n log n) divides the array into two halves and takes linear time to merge two halves.
	public static int[] mergeSort(int[] array, int beginning, int end) {
		// divide unsorted array into subarray, keep doing this until each subarray is just an element (base case):
			System.out.println(Arrays.toString(Arrays.copyOfRange(array, beginning, end + 1))); // exclusive
			// base case: if one element, go no further! return to previous call
			if (beginning == end) {
				int[] baseArray = {array[beginning]};
				return baseArray;
			}
			
			// divide into two
			int mid = (beginning + end) / 2;
			
			// this keeps getting called until you get a two-element array, then you reach base case and return value
			int[] temp1 = mergeSort(array, beginning, mid); // 4
		
			// this keeps getting called until you get a two-element arrays, then you reach base case and return value
			int[] temp2 = mergeSort(array, mid + 1, end); // 9
			
			System.out.println("merged called with " + Arrays.toString(temp1) + " and " + Arrays.toString(temp2));
			int[] merged = merge(temp1, temp2);
			return merged;
	}
	
	// takes in two SORTED subarrays and merges them
	public static int[] merge(int[] temp1, int[]temp2) {
		int[] array = new int[temp1.length + temp2.length];

		// k keeps track of larger array
		// i keeps track of temp1
		// j keeps track of temp2
		for (int k = 0, i = 0, j = 0; k < array.length; k++ ) {
//				System.out.println(Arrays.toString(array));
			
			// if you can iterate over both temp arrays
			if (i < temp1.length && j < temp2.length) {
				// compare values and add smaller to larger array
				if (temp1[i] <= temp2[j]) {
					array[k] = temp1[i];
					i++;
				} else {
					array[k] = temp2[j];
					j++;
				}
			} 
			// if one is done, just add elements of other array (should be sorted already)
			else if (i == temp1.length){
				array[k] = temp2[j];
				j++;
			} else {
				array[k] = temp1[i];
				i++;
			}			
		}
		
		System.out.println("after merging: " + Arrays.toString(array));
		return array;
	}
	
	// log n
	// divides array into different halves to look at. each half is 
	// no new arrays are made. we are just looking at parts of the array and directly manipulating them.
	public static void quickSort(int[] array, int beginning, int end) {
//		System.out.println(Arrays.toString(array));
		// base case is when an array is less than two elements (methods calls just stop at this point)
		// and it should be sorted by then
		System.out.println(beginning + " " + end);
		// more than one element
		if (beginning < end) {
			// find pivot while sorting
			int pivot = partition(array, beginning, end);
			
			// calls on broken up input
			quickSort(array, beginning, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}
	
	// moves elements into left, pivot, and right. returns pivot
	public static int partition(int[] array, int beginning, int end) {
		int pivot = array[end];
		System.out.println("Array before partition: " + Arrays.toString(Arrays.copyOfRange(array, beginning, end + 1)));
		System.out.println("Pivot: " + pivot);
		
		//{4, 9, 14, 15, 2, 12}
		// keeping track of smaller elements
		int i = beginning - 1;
		
		// compare all elements to pivot (don't iterate all the way to pivot)
		for (int j = beginning; j < end; j++) {
			// if current element is smaller than pivot
			if (array[j] <= pivot) {
				i++;
				// swap current smaller element position (i) with current element (j)
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
				
			}
		}
		
		// i + 1 should be the start of all the larger elements
		// swap with pivot and left and right sides will be lower and higher than pivot
		int temp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = temp;
		
		// array[i + 1] now contains our pivot
		System.out.println("Array after partition: " + Arrays.toString(Arrays.copyOfRange(array, beginning, end + 1)));
		System.out.println("--------------");
		return i + 1;
	}
}
