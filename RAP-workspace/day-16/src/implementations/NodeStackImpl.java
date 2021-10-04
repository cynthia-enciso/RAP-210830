package implementations;

public class NodeStackImpl {
	// two nodes
	Node top;
	Node head;
	
	// adding
	public void push(int element) {
		Node node = new Node(element);
		push(node);
	}
	// notice it is overloaded
	public void push(Node node) {
		node.setNext(top); 
		top = node; 
	}
	
	// removing
	public Node pop() {
		// make temp node reference
		Node poppedNode = top; 
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}
	
	// looking at current last element
	public Node peek() {
		return top; 
	}
	
	public String toString() {
		 String s = "";
		 Node runner = top;
		 while (runner != null) {
			  s += runner + " --> ";
			  runner = runner.getNext();
		 }
		 s += " end!";
		 return s;
	 }

}
