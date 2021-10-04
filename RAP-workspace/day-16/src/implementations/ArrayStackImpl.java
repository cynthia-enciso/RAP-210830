package implementations;

public class ArrayStackImpl {
		// start off with an array
		private int[] stack = new int[5]; 
		// keeps track of the last element index
		private int lastElementIndex = -1; 
		
		// adding
		public void push(int element) {
			// check if array isn't full
			if(lastElementIndex == stack.length - 1) {
				// create a new temp stack
				int[] newStack = new int[stack.length*2]; 
				// take elements of previous array and add it to new larger array
				for(int j = 0; j<stack.length; j++) {
					newStack[j] = stack[j];
				}
				// change reference to new, larger array
				stack = newStack; 
			}
			// increment our last element index
			lastElementIndex++;
			// give element at current index the value
			stack[lastElementIndex] = element;
			
		}
		
		// removing
		public Integer pop() {
			// are there any elements?
			if (lastElementIndex >= 0)
				// change the lastElementIndex to the previous element
				return stack[lastElementIndex--]; 		
			else 
				return null;
		}
		
		// look at the last element
		public int peek() {
			if (lastElementIndex < 0) {
				return -1;
			}
			return stack[lastElementIndex]; 
		}
		
		public String toString() {
			String s = "";
			 for (int i = 0; i <= lastElementIndex; i++) {
				 s += "[Index: " + i + " Data: " + stack[i] + "] --> ";
			 }
			 s += " end!";
			 return s;
		 }

}
