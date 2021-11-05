package examples.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class UsingExecutors {
	public static void main(String[] args) {
		ExecutorService service1 = Executors.newSingleThreadExecutor();
//		service1.execute(() -> System.out.println("task 1 from service thread"));
//		service1.execute(() -> System.out.println("task 2 from service thread"));
//		service1.execute(() -> System.out.println("task 3 from service thread"));
//		System.out.println("task 1 from main thread");
//		System.out.println("task 2 from main thread");
//		System.out.println("task 3 from main thread");
		
		
		service1.shutdown();
		
		ScheduledExecutorService service2 = Executors.newSingleThreadScheduledExecutor();
//		service2.schedule(() -> service2.shutdown(), 10, TimeUnit.SECONDS);
//		service2.scheduleWithFixedDelay(() -> System.out.println("delayed every 3 seconds"), 0, 3, TimeUnit.SECONDS);
		service2.shutdown();
		
		// you can create services that use not just a thread but a pool of threads with
		// newFixedThreadPool, newCachedThreadPool, newScheduledThreadPool, etc
		// if you have lots of tasks to do, they can be done asynchronously with available threads in pool
		
		
		ExecutorService service3 = Executors.newSingleThreadExecutor();
		Future<String> future = service3.submit(() -> {
			Thread.sleep(5000);
			return "Done sleeping!";
		});
		
		
		try {
			while(!future.isDone()) {
			System.out.println("Still waiting...");
			Thread.sleep(1000);
			}
			
			String result = future.get(6, TimeUnit.SECONDS);
			System.out.println("Result from future: " + result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			service3.shutdown();
		}
		
	}
}
