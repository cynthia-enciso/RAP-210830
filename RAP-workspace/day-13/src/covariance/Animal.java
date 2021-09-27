package covariance;

public class Animal {
	// fields
	private String name;
	private String type;
	private String funFact;
	
	// only constructor
	public Animal(String name, String type, String funFact) {
		this.name = name;
		this.type = type;
		this.funFact = funFact;
	}
	
	// notice no set name
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Animal Name: " + this.name + ", Animal Type: " + this.type + ", Fun Fact: " + this.funFact;
	}
	
	public void eat() {
		System.out.println("*Generic eating*");
	}
}
