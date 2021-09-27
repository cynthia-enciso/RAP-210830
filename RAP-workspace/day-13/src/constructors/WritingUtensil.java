package constructors;

public class WritingUtensil {
	// field
	private String inkColor;
	
	// default constructor
	public WritingUtensil() {
		super(); // calls parent class no-args constructor
		System.out.println("no-args WritingUtensil constructor called");
	}
	
	public void write() {
		System.out.println("*writes*");
	}
	
	public WritingUtensil(String inkColor) {
		this.inkColor = inkColor;
	}
	
	// getters and setters
	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	
}
