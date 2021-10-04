package examples;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<String> priority = new PriorityQueue<>();
		System.out.println("::::::: PriorityQueue :::::::::");
		priority.add("echo");
		priority.add("bravo");
		priority.add("charlie");
		priority.add("delta");
		priority.add("alpha");
		System.out.println(priority);
		
       // Printing the head element of PriorityQueue (left)
       System.out.println(priority.peek());
       // removing head
       System.out.println(priority.poll());
       priority.offer("foxtrot");
       System.out.println(priority);
	}
}
