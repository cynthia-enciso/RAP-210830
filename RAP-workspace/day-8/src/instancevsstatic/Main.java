package instancevsstatic;

// create some instance and static methods
// using Dog objects and static members
	// modify dog static variables! within and outside of the class
public class Main {
	
	// constant variable
	public static final int MY_CONSTANT_FIELD = 10;
	
	public static void main(String[] args) {
		// working with members of the Main class
//		printHello();
//		Main obj = new Main();
//		obj.printGoodbye();
		
		// working with static members of the Dog class
		Dog.staticDogMethod();
//		System.out.println(Dog.dogNumber);
		Dog.dogNumber = 25; // modify a static member of another class
//		System.out.println(Dog.dogNumber);
		
		// working with instance members of the Dog class
		Dog dog = new Dog();
//		System.out.println(dog.name);
		dog.bark();
//		System.out.println(dog.dogNumber); // this works but not best practice
		
		
	}
	
	// static method
	public static void printHello() {
		System.out.println("hello");
	}
	
	// instance method
	public void printGoodbye() {
		System.out.println("goodbye");
	}
}
