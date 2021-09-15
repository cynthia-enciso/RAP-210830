package instancevsstatic;

public class Dog {
	// instance variable
	public String name = "Rover";
	
	// static variables
	public static int dogNumber = 0;
	
	// instance method
	public void bark() {
		System.out.println("woof!");
		dogNumber = 100;
		System.out.println("dogNumber's value is: " + dogNumber);
	}
	
	// static method
	public static void staticDogMethod() {
		System.out.println("static dog method called!");
		dogNumber = 75;
		System.out.println("dogNumber's value is: " + dogNumber);
	}
}
