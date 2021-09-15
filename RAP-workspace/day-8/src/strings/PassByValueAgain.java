package strings;
// part 3 of the pass by value saga
	// strings are immutable objects!
public class PassByValueAgain {
	public int instanceVariable = 9;
	
	public static void main(String[] args) {
		// working with a primitive
		int x = 5;
		System.out.println("Value of x before change: " + x);
		changePrimitive(x);
		System.out.println("Value of x after change: " + x);
		
		// working with an object
		PassByValueAgain obj = new PassByValueAgain();
		System.out.println("Value of instanceVariable before change: " + obj.instanceVariable);
		changeObject(obj);
		System.out.println("Value of instanceVariable before change: " + obj.instanceVariable);
		
		// working with a string: strings are immutable
		String word = "NO";
		System.out.println("Value of word before change: " + word);
	    changeString(word);
	    System.out.println("Value of word before change: " + word);	 
	}
	
	public static void changePrimitive(int x) {
		x = 10; // changes only local variable
	}
	
	public static void changeObject(PassByValueAgain obj) {
		obj.instanceVariable = 10;
	}
	
	public static void changeString(String word) {
		word = "YES"; // creating a new string object (in the pool)
		
		// after the method finishes executing, the object gets dereferenced and is eligible for garbage collection
	}
}
