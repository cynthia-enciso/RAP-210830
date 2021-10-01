package exceptions;

public class Pen {
	private String inkColor = "blue";

	public String getInkColor() {
		return inkColor;
	}

//	public void setInkColor(String inkColor) {
//		if (inkColor == "") {
//			this.inkColor = "blue"; // back to default
//		} else {
//			this.inkColor = inkColor;
//		}
//	}
	
	public void setInkColor(String inkColor) {
		if (inkColor == "") {
			throw new IllegalArgumentException("empty string passed in as input!");
		} else {
			this.inkColor = inkColor;
		}
	}
}
