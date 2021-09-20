package strings;

public class UsingStringBuilder {
	public static void main(String[] args) {
		StringBuilder mutableWord = new StringBuilder("hello there");
		
		System.out.println("------------------ Length -------------------------");
		// length method works the same: length of characters
		System.out.println("Length of mutable string: " + mutableWord.length());
		mutableWord.setLength(8);
		System.out.println("Changed mutable string: " + mutableWord);
//		mutableWord.setLength(11);
		System.out.println("Changed mutable string: " + mutableWord);
		System.out.println("Length of mutable string: " + mutableWord.length());
		mutableWord.append("ere");
		System.out.println("Changed mutable string: " + mutableWord);
		
		System.out.println("\n------------------ Capacity -------------------------");
		// capacity: number of character spaces that have been allocated to the object
			// each new object starts with a capacity of 16
			// if an object has characters the capacity increases by how many characters it has
		StringBuilder mutableWord2 = new StringBuilder();
		System.out.println("Capacity of an empty StringBuilder Object: " + mutableWord2.capacity());
		StringBuilder mutableWord3 = new StringBuilder("hello");
		System.out.println("Capacity of StringBuilder object with 5 characters: " + mutableWord3.capacity());
		
		System.out.println("\n------------------ Adding/Removing -------------------------");
		// append
			// takes any data type and converts it into a string, then adds it to the end of the StringBuilder object
		System.out.println(mutableWord.append(", my name is Cynthia"));
		System.out.println("Length of mutable string: " + mutableWord.length()); 
		
		// h e l l o   t h e r e  ,      m  y    n  a  m  e     i  s     C  y  n  t  h  i  a
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
		
		// replace
		System.out.println(mutableWord.replace(24, 31, "Ralph")); // beginning inclusive, ending exclusive
		System.out.println("Length of mutable string: " + mutableWord.length()); // 29
		
		// h e l l o   t h e r e  ,      m  y    n  a  m  e     i  s     R  a  l  p  h
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28
		
		// set CharAt
		mutableWord.setCharAt(25, 'o');
		System.out.println(mutableWord);
		
		// h e l l o   t h e r e  ,      m  y    n  a  m  e     i  s     R  o  l  p  h
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28
		
		// delete
		System.out.println(mutableWord.delete(5, 11)); // inclusive, exclusive
		System.out.println("Length of mutable string: " + mutableWord.length());
	
		System.out.println(mutableWord.deleteCharAt(5));
		System.out.println("Length of mutable string: " + mutableWord.length());
		
		System.out.println("\n------------------ Reverse -------------------------");
		System.out.println(mutableWord.reverse());
	}
}
