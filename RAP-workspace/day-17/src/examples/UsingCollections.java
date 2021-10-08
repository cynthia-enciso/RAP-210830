package examples;

import java.util.ArrayList;
import java.util.Collections;

public class UsingCollections {
	public static void main(String[] args) {
		// use an arraylist
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		arrli.add(4);
		arrli.add(1);
	    arrli.add(3);
	    arrli.add(5);
	    arrli.add(2);
	    System.out.println(arrli);
	    
	    // sort
		Collections.sort(arrli);
		System.out.println(arrli);
	    // min
		System.out.println(Collections.min(arrli));
	    // max
		System.out.println(Collections.max(arrli));
	    // binarySearch
		System.out.println(Collections.binarySearch(arrli, 2));
	    // reverse
		Collections.reverse(arrli);
		System.out.println(arrli);
	}
}
