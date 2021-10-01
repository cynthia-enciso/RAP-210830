package problem7;

public class BadInput {
	public static void badInput(String word) {
		if (word.equals("")) {
			throw new IllegalArgumentException("Get out of here!");
		}
	}
}
