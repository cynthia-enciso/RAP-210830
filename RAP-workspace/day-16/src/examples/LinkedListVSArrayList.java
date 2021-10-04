package examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVSArrayList {
	public static void main(String[] args) {
		System.out.println(":::::::Linked List::::::");
		LinkedList<Integer> linkedlist = new LinkedList<>();
		
		// like deque
		linkedlist.add(2);
		linkedlist.addFirst(1);
		linkedlist.addLast(3);
		System.out.println(linkedlist);
		
    	// common list methods:
			// add(value) or add(index, value). if added in a specific index, other elements pushed back
			// get(index)
			// remove(index)
			// set(index, value) replaces
		
		linkedlist.set(0, 6);
		System.out.println(linkedlist);
		System.out.println(linkedlist.indexOf(3)); // element
		
		System.out.println(":::::::Array List::::::");
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println(arrayList);
		arrayList.set(3, 7);
		System.out.println(arrayList);
		arrayList.remove(3);
		System.out.println(arrayList);
		System.out.println(arrayList.get(3));
		
		
	}
}
