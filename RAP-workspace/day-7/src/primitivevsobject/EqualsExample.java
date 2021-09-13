package primitivevsobject;

public class EqualsExample {
	// fields
	public int value = 10;
	
	public static void main(String[] args) {
		System.out.println("----------- Comparing Primitives ------------");
		int primitive = 5;
		int primitive2 = 5;
		System.out.println(primitive == primitive2); // true
		
		System.out.println("----------- Comparing Objects ------------");
		// reference variables contain the address in memory an object exists
			// even if objects have the same property, if they are different objects,
			// using == returns false
		EqualsExample obj1 = new EqualsExample();
		System.out.println(obj1.value); // 10
		
		EqualsExample obj2 = new EqualsExample();
		System.out.println(obj2.value); // 10
		
		System.out.println(obj1 == obj2); // false
		
		obj2 = obj1;
		
		System.out.println(obj1 == obj2); // true
	}
}
