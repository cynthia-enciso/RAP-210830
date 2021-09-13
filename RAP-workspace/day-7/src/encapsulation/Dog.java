package encapsulation;

public class Dog {
	// fields
	private String name = "Jones";
	private int age = 5;
	private double weight = 10.0;
	
	// constructors
	public Dog() {
		
	}
	
	// methods
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// validation in one place instead of throughout project
	public void setAge(int age) {
		if (age <= 0) {
			this.age = 1;
		} else {
			this.age = age;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
