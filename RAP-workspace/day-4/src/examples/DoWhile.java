package examples;

public class DoWhile {
	public static void main(String[] args) {
		
		boolean isBored = true;
		
		do {
			System.out.println("I think I'm going to change the channel on TV...");
			System.out.println("*changes channel, watches TV*");
			
			// make decision
			System.out.println("Am I still bored?\n");
			isBored = false;
		} while(isBored);
		
		
		int tvWatchingLimit = 10;
		
		do {
			System.out.println("I think I'm going to change the channel on TV...");
			System.out.println("*changes channel, watches TV*");
			// spends 1 TV watching limit times
			tvWatchingLimit--; 
			
			// make decision
			System.out.println("Have I reached my limit of channels to browse through?");
			
			// if I have more than 1 time left
			if (tvWatchingLimit > 1) {
				System.out.println("I have " + tvWatchingLimit + " channels left to browse.");
			} 
			// if I have just one more channel I can watch
			else if (tvWatchingLimit > 0) {
				System.out.println("I have " + tvWatchingLimit + " channel left to browse.");
			} 
			// I have no more channels I can watch
			else {
				System.out.println("I have browsed every channel... time to find something else to do.");
			}
		} 
		// while I can still watch TV
		while(tvWatchingLimit > 0);
	}
	
	
}
