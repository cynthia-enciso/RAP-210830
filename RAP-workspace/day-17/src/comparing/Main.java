package comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Dog dog1 = new Dog("German Shepard", 2, 80.0);
		Dog dog2 = new Dog("Corgi", 5, 13.0);
		Dog dog3 = new Dog("Standard Poodle", 8, 75.0);
		Dog dog4 = new Dog("Pug", 3, 25);
		
		ArrayList<Dog> dogs = new ArrayList<>();
		
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		dogs.add(dog4);
		System.out.println(dogs);
		
		Collections.sort(dogs);
		System.out.println(dogs);
		Collections.sort(dogs, new AgeComparator()); // use the age comparison
		System.out.println(dogs);
		Collections.sort(dogs, new WeightComparator()); // use the weight comparison
		System.out.println(dogs);
		
		
		// using sorting with an array vs a collection
		// create dog array 
		Dog[] dogArray = new Dog[dogs.size()];
		// use toArray and pass in dogArray so type can be passed in
		dogArray = dogs.toArray(dogArray);
		Arrays.sort(dogArray); // can do because class implements Comparable
		
	}
}
