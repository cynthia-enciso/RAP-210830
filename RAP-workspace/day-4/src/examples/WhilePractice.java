package examples;

public class WhilePractice {
	public static void main(String[] args) {
		
		// variable to keep track of
		boolean myBool = true;
		
		// your loop
			// test a condition
		while (myBool) {
			System.out.println("inside while loop");
			// manipulate your variable
			myBool = false;
		}
			
		int num = 5;
		
		while (num < 10) {
			System.out.println("inside second while loop");
			// manipulate your variable
			num++;
		}
		
		// using a while loop to iterate over an array
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		int index = 0;
		
		while (index < vowels.length) {
			System.out.println(vowels[index++]); // post returns original value first, then increments
		}
	}
}
