package examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UsingSets {
	// not index driven, usually backed by maps or trees
	// unique elements only
	// unordered (does not track insertion order)
	public static void main(String[] args) {
		// hashset
			// allows null values
			// fast insertion and traversal
			// better performance, but does not maintain insertion order
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Hello");
		hashSet.add("there");
		hashSet.add("my");
		hashSet.add("name");
		hashSet.add("is");
		hashSet.add("Cynthia");
//		hashSet.add(null);
		System.out.println(hashSet);
		System.out.println(hashSet.contains("is"));
		
		// treeset
			// slow to insert or remove if tree is large
			// sorted
			// doesn't allow null values
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.addAll(hashSet);
		System.out.println(treeSet);
		
		// linkedhashset
			// has a linked list under the hood that keeps insertion order
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Hello");
		linkedHashSet.add("there");
		linkedHashSet.add("my");
		linkedHashSet.add("name");
		linkedHashSet.add("is");
		linkedHashSet.add("Cynthia");
		System.out.println(linkedHashSet);
		
	}
}
