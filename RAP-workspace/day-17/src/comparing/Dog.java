package comparing;

public class Dog implements Comparable<Dog> {
	// fields
	private String breed;
	private int age;
	private double weight;
	
	public Dog(String breed, int age, double weight) {
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Dog o) {
		// if first object is less than second object
		if (this.getBreed().compareToIgnoreCase(o.getBreed()) < 0) {
			return -1;
		} else if (this.getBreed().compareToIgnoreCase(o.getBreed()) > 0) {
			return 1;
		}
		return 0;
	}
	
	// methods
	@Override
	public String toString() {
		return "{ " + this.breed + ": " + this.age + ", " + this.weight + " }";
	}
	
	// getters and setters
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}


	
	
}
