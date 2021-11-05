package examples.creation;

public class SimpleThread extends Thread {
	
	@Override
	public void run() {
		// try with small and then large number
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + this.getId()+ ": "+ i);
		}
	}
}
