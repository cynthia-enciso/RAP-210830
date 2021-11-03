package examples.functionals;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UsingPredefinedInterfaces {
	public static void main(String[] args) {
		/* 
	 	public interface Supplier<T> {
	 		T get();
	 	}
		 */
		
		Supplier<String> supplier = () -> {return "hello";};
		System.out.println(supplier.get());
		System.out.println(supplier);
		
		/* 
	 	public interface Consumer<T> {
	 		void accept(T t);
	 	}
	 	
	 	public interface BiConsumer<T, U> {
			void accept(T t, U u);
	 	}
		 */
		
		Consumer<String> stringConsumer = x -> System.out.println(x);
		stringConsumer.accept("goodbye");
		
		BiConsumer<String, Integer> biConsumer = (x, y) -> {
			for (int i = 1; i <= y; i++) {
				System.out.println(x);
			}
		};
		
		biConsumer.accept("sunshine", 3);
		
		/* 
	 	public interface Predicate<T> {
	 		boolean test(T t);
	 	}
	 	
	 	 	public interface BiPredicate<T, U> {
	 		boolean test(T t, U u);
	 	}
		 */
		
		Predicate<String> stringPredicate = x -> x.isEmpty();
		System.out.println(stringPredicate.test(""));
		BiPredicate<String, String> biPredicate = (x, y) -> x.contains(y);
		System.out.println(biPredicate.test("hello", "he"));
		
		/* 
	 	public interface Function<T, R> {
	 		R apply(T t);
	 	}
	 	
	 	public interface BiFunction<T, U, R> {
	 		R apply(T t, U u);
	 	}
		 */
		
		Function<Integer, String> function = x -> "my integer is: " + x;
		System.out.println(function.apply(5));
		
		BiFunction<Integer, Integer, String> biFunction = (x, y) -> "my sum is: " + (x + y);
		System.out.println(biFunction.apply(5, 4));
	}
}
