package zoo;

public class Bear extends Animal {

	public Bear(String name) {
		super(name, "Bear", "Bears are huge.");
	}

	// subclass method
	public void hibernate() {
		System.out.println(this.getName() + " is sleeping.");
	}

	@Override
	public void eat() {
		System.out.println("Eats berries");
		
	}
	
}
