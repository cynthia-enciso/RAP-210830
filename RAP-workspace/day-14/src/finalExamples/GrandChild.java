package finalExamples;

public class GrandChild extends Child {
	public final int myInt = 5;
	
	// can't override final method
//	public void someMethod() {
//		System.out.println("grandchild overriding child method");
//	}
	
	public void anotherMethod() {
//		myInt = 6; // cannot reassign final variable
	}
}
