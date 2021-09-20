package strings;

public class ComparingStringBuilderAndStrings {
	public static void main(String[] args) {
		String word = "hello";
		StringBuilder mutableWord = new StringBuilder("hello");
		
		System.out.println("------------------ Mutability -------------------------");
		System.out.println("String before change: " + word);
		changeString(word);
		System.out.println("String after change: " + word);
		
		System.out.println("StringBuilder before change: " + mutableWord);
		changeString(mutableWord);
		System.out.println("StringBuilder after change: " + mutableWord);
		
		
	}
	
	public static void changeString(String word) {
		word += " there"; // created a new object within the method
	}
	
	public static void changeString(StringBuilder word) {
		word.append(" there"); // change our original object
	}
}
