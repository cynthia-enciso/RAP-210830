package examples.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class UsingMessenger {
	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		
		// Create producer thread
	    Thread t1 = new Thread(new Runnable() {
	        @Override
	        public void run() {
	            try {
	                messenger.produce("Hello");
	                messenger.produce("Hi there");
	                messenger.produce("Howdy");
	                messenger.produce("Hola");
	                messenger.produce("Hiya");
	            }
	            catch (InterruptedException e) {
	                System.out.println("Producer interrupted!");
	            	e.printStackTrace();
	            }
	        }
	    });
	    
	 // Create consumer thread
	    Thread t2 = new Thread(new Runnable() {
	        @Override
	        public void run() {
	            try {
	                messenger.consume();
	                messenger.consume();
	                messenger.consume();
	                messenger.consume();
	                messenger.consume();
	            }
	            catch (InterruptedException e) {
	                System.out.println("Producer interrupted!");
	            	e.printStackTrace();
	            }
	        }
	    });
	    
	    // #1: Start both threads without joining
	    t1.start();
	    t2.start();
	}
}
