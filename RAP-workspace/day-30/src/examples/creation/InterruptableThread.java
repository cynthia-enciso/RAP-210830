package examples.creation;

public class InterruptableThread extends Thread {
	@Override
	public void run() {
		String message[] = {
	            "line 1",
	            "line 2",
	            "line 3",
	            "line 4"
	        };

        for (int i = 0; i < message.length; i++) {
            //Pause for 4 seconds
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// if interrupted, no more messages
				return;
			}
            //Print a message
            System.out.println(message[i]);
        }
	}
}
