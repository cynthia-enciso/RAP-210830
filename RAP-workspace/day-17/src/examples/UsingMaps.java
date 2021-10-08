package examples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class UsingMaps {
	
//Hashing is a process of converting an object into integer form by using the method hashCode()
//hashCode() method is used to get the hash Code of an object. 
//In HashMap, hashCode() is used to calculate the bucket and therefore calculate the index in underlying array.
// array as a table. each index can contain a node or several (if collision happens, in which case the nodes
// in a bucket are stored in either a linked list or a tree. in Java, a tree is used to perform faster.
	
	public static void main(String[] args) {
		// hashtable: synchronized hashmap
			// one big difference: hashtables do not allow null keys or values
		Hashtable<String, Integer> hashTable = new Hashtable<>();
		
		// hashmap
			// hashmaps allow up to 1 null key and any number of null values
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put(null, 5);
		hashMap.put(null, 1); // replaces
		hashMap.put("One", null);
		hashMap.put("Two", 3);
		hashMap.put("Two", 10);
		
		
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Four", 4);
		hashMap.put("Five", 5);
		System.out.println(hashMap); // doesn't use insertion order
		
		// treemap
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Bravo", 1);
		treeMap.put("Delta", 2);
		treeMap.put("Echo", 3);
		treeMap.put("Charlie", 4);
		treeMap.put("Alpha", 5);
		treeMap.put("Alpha", 6); // no duplicates, replaces
		System.out.println(treeMap);
		
		// linkedhashmap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Three", 3);
		linkedHashMap.put("Four", 4);
		linkedHashMap.put("Five", 5);
		System.out.println(linkedHashMap); // maintains insertion order
		
		// methods:
			// put
			// get
		System.out.println(hashMap.get("Two"));
		System.out.println(hashMap.containsKey("Six"));
		System.out.println(hashMap.containsValue(4));
			// remove
		System.out.println(hashMap.remove("Two")); // takes in key
			// keyset
		Set<String> keySet = hashMap.keySet();
		System.out.println(keySet);
			// values
		Collection<Integer> values = hashMap.values();
		System.out.println(values);
			// entryset
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		System.out.println(entrySet);
		
		for (Map.Entry<String, Integer> pair : hashMap.entrySet()) {
			System.out.println(pair);
		}
	}
}
