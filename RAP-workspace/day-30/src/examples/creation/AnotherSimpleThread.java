package examples.creation;

public class AnotherSimpleThread implements Runnable {

	private final int numberOfThread;
	
	public AnotherSimpleThread(int i) {
		this.numberOfThread = i;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// can't do this because it doesn't have any inherited fields
			// System.out.println("Thread " + this.getId()+ ": "+ i);
			
			// workaround
			System.out.println("Thread " + this.numberOfThread + ": "+ i);
		}
	}

	
}
