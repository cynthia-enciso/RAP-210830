package implementations;

public class Main {
	public static void main(String[] args) {
		System.out.println("--------------- LinkedList ----------------------");
		LinkedListImpl linkedlist = new LinkedListImpl();
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(6);
		linkedlist.remove(); // removes current head
		System.out.println(linkedlist);
		
		System.out.println("--------------- NodeStack ----------------------");
		NodeStackImpl nodestack = new NodeStackImpl();
		nodestack.push(1);
		nodestack.push(2);
		nodestack.push(3);
		nodestack.push(4);
		nodestack.push(5);
		nodestack.push(6);
		System.out.println("Current top before pop: " + nodestack.peek());
		nodestack.pop();
		System.out.println("Current top after pop: " + nodestack.peek());
		System.out.println(nodestack);
		
		System.out.println("--------------- ArrayStack ----------------------");
		ArrayStackImpl arraystack = new ArrayStackImpl();
		arraystack.push(1);
		System.out.println(arraystack.pop());
		System.out.println(arraystack.peek());
		arraystack.push(2);
		arraystack.push(3);
		arraystack.push(4);
		arraystack.push(5);
		arraystack.push(6);
		
		System.out.println(arraystack);
	}
}
