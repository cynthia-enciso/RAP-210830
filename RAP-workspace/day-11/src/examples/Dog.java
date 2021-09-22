package examples;

import java.util.Objects;

public class Dog extends Animal {
	// fields
	private boolean hasChewToy;
	private Collar collar = new Collar();
	

	// methods
	@Override
	public void speak() {
		System.out.println("*bark bark*");
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + " Has chew toy: " + isHasChewToy() + " and dog's collar's color is " + this.collar.getColor();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(collar, hasChewToy);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(collar, other.collar) && hasChewToy == other.hasChewToy;
	}

	// getters and setters
	public boolean isHasChewToy() {
		return hasChewToy;
	}

	public void setHasChewToy(boolean hasChewToy) {
		this.hasChewToy = hasChewToy;
	}
	
	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}
}
