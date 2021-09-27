package constructors;

public class Pen extends WritingUtensil {

	public Pen() {
//		super();
		System.out.println("no args Pen constructor called");
	}
	
	public Pen(String inkColor) {
		this();
		this.setInkColor(inkColor);
	}
	
	public void write() {
		super.write();
		System.out.println("*writes scratchily*");
	}
}
