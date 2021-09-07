package examples;

public class ContinueBreak {
	public static void main(String[] args) {
		
		int x = 0;
		
		for (;;) {
			x++;
			System.out.println("start of for loop");
			
			
			if (x != 8) {
				System.out.println(x);
			}
			
			if (x == 5) {
				continue; // stops current iteration, but loop keeps going
			}
			
			if ( x == 8) {
				break; // breaks out of loop
			}
			
			System.out.println("end of for loop\n");
		}
	}
}
