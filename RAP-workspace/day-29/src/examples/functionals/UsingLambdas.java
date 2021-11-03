package examples.functionals;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingLambdas {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Consumer<Integer> consumer = new PrintOut<Integer>();
		
		list.forEach(consumer);
		
		list.forEach(x -> System.out.println(x));
		
		System.out.println(closure());
	}
	
	// closure
	public static int closure() {
		// local variables
		int a = 3; 
		int b = 4;
		
		Sum sum = () -> a + b;
		return sum.add();
	}
}
