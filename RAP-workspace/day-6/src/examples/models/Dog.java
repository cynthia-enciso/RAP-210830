package examples.models;

public class Dog {
	// fields / properties / variables / represent your object's state
		// if not given a value, they get default values
	public String name = "Jerry";
	public int age = 5;
	public boolean hasTail = true;
	public Collar collar = new Collar();
	
	// constructors: are called to create objects of the class
		// special methods
	public Dog() {
		
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Dog(String name, int age, boolean hasTail) {
		this.name = name;
		this.age = age;
		this.hasTail = hasTail;
	}
	
	
	// methods / represent your object's behavior
	public void bark() {
		System.out.println("woof!");
	}
	
	public void age() {
		age++;
	}
}
