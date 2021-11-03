package examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class UsingStreams {
	public static void main(String[] args) {
		/* -------------------------------- Creating Streams ----------------------------------- */
		// finite stream
		Stream<Integer> stream1 = Stream.of(1);
		Stream<Integer> stream2 = Stream.of(new Integer[] {1, 2, 3, 4, 5});
		
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		Stream<Integer> stream3 = list.stream();
		
		// infinite stream
		Stream<Integer> stream4 = Stream.generate(() -> {
			Random random = new Random();
			return random.nextInt(101);
		});
//		stream4.forEach(element -> System.out.println(element));
		
		// iterate(): infinite stream if you do not include second parameter
		Stream<Integer> stream5 = Stream.iterate(1, x -> x < 50, x -> x * 2);
		stream5.forEach(x -> System.out.println(x));
		
		/* ------------------------------ Terminal Operators ----------------------------------- */
		// count
			// reduction operation: takes in many, returns one
		System.out.println(stream1.count());
		
		// forEach
		stream2.forEach(x -> System.out.println(x));
		
		// reduce(): takes in a BiFunction (two params, one result)
			// you can also start off with a different value other than zero
			// here, x represents current result and y the next value to work with
			// reduction
		System.out.println(stream3.reduce(0, (x, y) -> x + y));
		
		/* ------------------------------ Adding in Intermediate Operators ---------------------- */
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			arrayList.add(i);
		}
		
		// filter() returns a Stream with elements that match an expression
		arrayList.stream().filter(x -> x <= 5).forEach(x -> System.out.println(x));
		
		arrayList.add(2);
		arrayList.add(5);
		
		// distinct
		arrayList.stream().distinct().forEach(x -> System.out.println(x));
		
		// limit and skip
		arrayList.stream().skip(2).limit(5).forEach(x -> System.out.println(x));
		
		//map: creates a one-to-one mapping from elements in current stream to the elements in the next one
		// takes in a Function (takes in a param and returns a result)
		arrayList.stream().map(x -> x * 2).forEach(x -> System.out.println(x));
		
	}
}
