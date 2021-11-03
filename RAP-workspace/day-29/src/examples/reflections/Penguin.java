package examples.reflections;

public class Penguin {
	// fields
	public String species;
	
	// constructors
	public Penguin(String species) {
		this.species = species;
	}
	
	// methods
	public void speak(String tone) {
		switch(tone) {
		case "loud": System.out.println("*SCREECH*"); 
					break;
		case "soft": System.out.println("*coo*");
					break;
		default: System.out.println("Wrong input.");
		}
	}
}
