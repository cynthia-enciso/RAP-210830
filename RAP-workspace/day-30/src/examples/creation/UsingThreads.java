package examples.creation;

public class UsingThreads {
	public static void main(String[] args) {
		Thread t1 = new SimpleThread();
		Thread t2 = new SimpleThread();
		
		System.out.println(t1.getState());
		
		Thread t3 = new Thread(new AnotherSimpleThread(15));
		
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread " + 16 + ": "+ i);
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		// in RUNNABLE state
		System.out.println(t1.getState());
	}
}
