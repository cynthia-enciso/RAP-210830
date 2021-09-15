package strings;

public class CreatingStrings {
	public static void main(String[] args) {
		// string literal: in string pool
		String str1 = "hello world";
		
		// string created using new keyword + constructor: in heap outside of pool
		String str2 = new String("hello world");
		
		// string literal: shares first string object in pool
		String str3 = "hello world";
		
		// comparing string
		int prim1 = 5;
		int prim2 = 5;
		System.out.println(prim1 == prim2); // true
		
		System.out.println(str1 == str2); // one object in pool, other in heap
		
		System.out.println(str1 == str3); // both references looking at same object in pool
		
		// intern: moves object from heap to pool if not already there
		str2 = str2.intern();
		System.out.println(str1 == str2); // now true
		
		String str4 = new String("hello world");
		// equals: looks at values/properties inside of objects and compares those
		System.out.println(str1.equals(str4)); // true
	}
}
