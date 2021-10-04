package implementations;
// also a queue
public class LinkedListImpl {
	// head
	Node head; 
	
	// add
	public boolean add(Node node) {
		// if empty
		if(head == null) {
			// make new node the head
			head = node; 
		} else {
			// start with head
			Node runner = head; 
			// go down the nodes until you get to the very end
			while(runner.getNext() != null) {
				runner = runner.getNext();
			}
			// attach new node to old end of list
			runner.setNext(node);
		}
		return true; 
	}
	
	// overloaded
	public boolean add(int value) {
		Node newNode = new Node(value);
		return add(newNode); 
	}

	// remove (from beginning)
	public  Integer remove() {
		// if empty
		if(head == null) {
			System.out.println("Empty List");
			return -1;
		}else {
			Node temp = head; 
			head = head.getNext(); 
			temp.setNext(null);
			return temp.getData(); 
		}
	}

	 
	 public String toString() {
		 String s = "";
		 Node runner = head;
		 while (runner != null) {
			  s += runner + " --> ";
			  runner = runner.getNext();
		 }
		 s += " end!";
		 return s;
	 }
}
