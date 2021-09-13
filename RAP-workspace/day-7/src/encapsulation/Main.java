package encapsulation;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
//		dog.name; cannot access private property
		System.out.println(dog.getName());
		
		// validation the user input
		int input = -5;
		if (input <= 0) {
			dog.setAge(1);
		} else {
			dog.setAge(input);
		}
	}
}
