package searching;

public class SearchingExamples {
	// to test our functions
	public static void main(String[] args) {
		// test linear search
		int result = linearSearch(new int[] {1, 2, 3, 4, 5}, 6);
		System.out.println(result);
		
		// test binary search
		result = binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6);
		System.out.println(result);
		
	}
	
	// linear search: O(n)
		// input: int array, value that we're looking for
		// output: index or -1
	
	public static int linearSearch(int[] array, int targetValue) {
		// WHILE we still have an element to iterate over
		for (int i = 0; i < array.length; i++) {
			// get current element
			int currentElement = array[i];
			// IF current element is the same as the target element THEN
			if ( currentElement == targetValue) {
				// RETURN index of element
				return i;
			}
		}
		// END OF WHILE LOOP
		// RETURN -1 if we haven't returned from loop yet
		return -1;
	}
	
	// binary search: O(log n)
		// input: int array, value that we're looking for
		// output: index or -1
	
	public static int binarySearch(int[] array, int targetValue) {
		// create variables needed
			// beginning index
			int beginningIndex = 0;
			// end index
			int endIndex = array.length - 1;
		
		// WHILE we still have input to look through
			while (beginningIndex <= endIndex) {
				// debugging statement
				System.out.printf("Calculating midpoint: (%d + %d) / 2 = %d%n", endIndex, beginningIndex, (endIndex + beginningIndex) / 2);
			// find the midpoint
				int midIndex = (endIndex + beginningIndex)/ 2; // dividing with ints so you get a whole number midpoint
			// get value of midpoint
				int midValue = array[midIndex];
				
				// debugging statements
				System.out.println("BeginIndex = "+ beginningIndex+ " EndIndex = "+ endIndex);
				System.out.println("MidValue = "+ midValue +" midIndex = "+ midIndex);
				
			// IF value of midpoint == target value THEN
				if (targetValue == midValue) {
				// RETURN midpoint
					return midIndex;
				}
			// ELSE IF value of midpoint < target value THEN
				else if (targetValue > midValue) {
				// change the beginning index to midpoint + 1
					beginningIndex = midIndex + 1;
				}
			// ELSE
				else {
				// change the end index to midpoint
					endIndex = midIndex;
				}
			}
		// END OF WHILE LOOP
		// RETURN -1
		return -1;
	}
	
}
