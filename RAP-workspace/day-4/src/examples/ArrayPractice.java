package examples;

import java.util.Arrays;

public class ArrayPractice {
	public static void main(String[] args) {
		System.out.println("------------------ CREATING ARRAYS --------------------- ");
		// explicitly giving size
		int[] numbers = new int[5]; // filled with default values
		numbers[3] = 6;
		numbers[3] = 9;
		
		// 0 1 2 3 4
		// give default values
		char[] characters = new char[] {'a', '2', 'G'};
		// shortcut for creating an array with default values
		String[] words = {"hello", "there", "friend"};
		
		// several ways to syntactically create an array
		int[] array1;
		int array2[];
		int [] array3;
		int array4 [];
		int []array5;
		
		// declaring multiple variables with arrays included
		int a, b; // declaring two int variables
		int[] c, d; // declaring two int array variables
		int e[], f; // declaring an int array and an int variable
		
		// this is more clear!
		int g[];
		int h;
		
		//printing out arrays
		System.out.println(words);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(characters));
		System.out.println(Arrays.toString(words));
		System.out.println(words[0]); // access the first element
		System.out.println(words[words.length - 1]); // access last element
		
		System.out.println("------------------ ARRAY METHODS --------------------- ");
		// sorting
		Arrays.sort(numbers);
		Arrays.sort(characters); // sorting characters: numbers before uppercase before lowercase
		Arrays.sort(words);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(characters));
		System.out.println(Arrays.toString(words));
		
		// binarySearch
		int index = Arrays.binarySearch(words, "goodbye");
		// negative number when not present in array
			// number represents where it should be
		System.out.println(index); 
		
		// comparing
		int[] compare1 = {1, 2, 3, 4, 6};
		int[] compare2 = {1, 2, 3, 4, 6};
		int[] compare3 = new int[5]; // defaults are zero //  0, 0, 0, 0, 0
		
		System.out.println(Arrays.compare(compare1, compare3));
		// negative number returned: 
			// first array is smaller or first value to differ is smaller in first array
		// zero returned: same size, same values
		// positive number returned: 
			// first array is either larger or the first differing value is larger in the first array
		
		// multidimensional arrays
		int[][] multi1; // 2D array
		int mutli2[][]; // 2D array
		int[] multi3[]; // 2D array
		int[] multi4[], multi5[]; // 2, 2D arrays
		int[] multi6[], multi7[][]; // one 2D array, one 3D array
		
		// specifying a size
		int[][] multi8 = new int[3][3];
		int[][] multi9 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		// asymmetrical arrays
		int[][] multi10 = new int[3][]; // you don't have to specify sizes of inner arrays
		multi10[0] = new int[1];
		multi10[1] = new int[8];
		multi10[2] = new int[3];
		
		System.out.println("\nAsymmetrical Array:");
		for(int i = 0; i < multi10.length; i++) {
			// for every row, print it out
			System.out.println(Arrays.toString(multi10[i]));
		}
		
	}
}
