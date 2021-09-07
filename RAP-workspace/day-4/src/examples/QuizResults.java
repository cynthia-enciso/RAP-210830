package examples;

public class QuizResults {
	public static void main(String[] args) {
		System.out.println("Question 1: ");
		boolean myBool = true;
		System.out.println(!myBool);
		
		
		System.out.println("\nQuestion 2: ");
		int num = 5;
		String word = "10";
		System.out.println(word + num);
		
		System.out.println("\nQuestion 3: ");
		int num2 = 3;
		
		if (num2 > 1) {
			System.out.println("1");
		} else if (num2 == 3) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
		
	}
}
