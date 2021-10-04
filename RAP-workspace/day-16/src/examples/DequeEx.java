package examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	public static void main(String[] args) {
		System.out.println("::::::: ArrayDeque :::::::::");
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		// add elements
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		System.out.println(deque);
		
		// queue: first in, first out
			// pushing, popping still works with head
		System.out.println("::::::: Like a Queue :::::::::");
		System.out.println("after polling:");
        deque.poll(); // removes element at head
        System.out.println(deque);
        System.out.println("after offering:");
        deque.offer(6); // adds element at tail
        System.out.println(deque);
        System.out.println("peeking:" + deque.peek()); // head
        
		// stack: last in, first out
        System.out.println("::::::: Like a Stack :::::::::");
        deque.addLast(7); // adds element at head
        System.out.println("after pushing:");
        System.out.println(deque);
        deque.removeLast(); // removes element from head
        System.out.println("after popping:");
        System.out.println(deque);
        System.out.println("Current top: " + deque.getLast() + "\n");
	}
}
