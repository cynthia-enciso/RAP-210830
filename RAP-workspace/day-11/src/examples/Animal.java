package examples;

import java.util.Objects;

public class Animal {
	// properties
	private String name;

	// constructors
	public Animal() {}
	
	// methods
	public void speak() {
		System.out.println("*generic animal noises*");
	}
	
	@Override
	public String toString() {
        return "Object: " + this.getClass() + " Name: " + this.getName();
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override // bad practice, deprecated!
	public void finalize() {
		System.out.println("object is being destroyed!");
	}
	
	// getters and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Animal[] animals = new Animal[3];
	
//	animals[0] = anim;
	
}
