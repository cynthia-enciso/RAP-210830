package examples;

import java.util.Arrays;

public class ForLoopExamples {
	public static void main(String[] args) {
		String myString = "hello world";
		
		// converting a string to a character array
		char[] characters = new char[myString.length()];
		
		// variable; condition ; manipulation code
		for (int i = 0; i < characters.length; i++) {
			characters[i] = myString.charAt(i);
		}
		
		// printing out character arrays gives you what you expect
		System.out.println(characters);
		System.out.println(Arrays.toString(characters));
		
		char[] myOtherCharacterArray = myString.toCharArray();
		System.out.println(myOtherCharacterArray);
		
		// where 1 would be starting index
		int num = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// enhanced for-loop
		for (char character : myOtherCharacterArray) {
			System.out.print(character + " ");
		}
		
		// prime number check example
		// primes are greater than 1
		// primes are divisible by only 1 and itself, so we don't count those
		// factors of a number can't be greater than half of it
		// https://www.omnicalculator.com/math/factor#what-is-a-factorfactor-definition
		int myNumber = 29;
		boolean isPrime = true;
		
		for (int i = 2; i <= myNumber / 2; i++) {
			// check if not prime
			if (myNumber % i == 0) {
				isPrime = false;
				// if not prime, we are done
				break;
			}
		}
		
		System.out.println("\n" + isPrime);
		
		// labels, multidimensional array example
		int[][] multi = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int lookingFor = 10;
		int row = -1;
		int column = -1;
		
		// iterating over every row
		
		search:
		for (int i = 0; i < multi.length; i++) {
			// iterating over every column
			for (int j = 0; j < multi[i].length; j++) {
				// if element at i, j is what we're looking for
				if (multi[i][j] == lookingFor) {
					row = i;
					column = j;
					break search; // break out of both loops, not just inner loop
				}
			}
		}
		
		// check row and column
		if (row != -1 && column != -1) {
			System.out.println("element " + lookingFor + " was found at position " + row + ", " + column);
		} else {
			System.out.println("element not found in array");
		}
	}
}
