package problem3;

public class UsingArray {
	public static void usingArray() {
		int[] array = {5, 23, 7, 18};
		

        //array cannot print properly without using a method and field from the Arrays class
        // try using a try/catch block, this syntax is correct except it is accessing a bad index
		System.out.println(array[10]);
	}
}
