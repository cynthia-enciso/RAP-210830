package examples;

import java.util.Objects;

public class Collar {
	private String color = "red";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collar other = (Collar) obj;
		return Objects.equals(color, other.color);
	}
	
	
}
