package examples;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------------------- INHERITANCE --------------------");
		Animal anim = new Animal();
		Dog dog = new Dog();
		
		anim.speak();
		dog.speak(); // dog object uses its own implementation of parent's method
		System.out.println("Does dog have chew toy? " + dog.isHasChewToy());
		
		// can't do: animal doesn't inherit from its suclasses
//		System.out.println("Does animal have chew toy? " + anim.isHasChewToy()); 
		
		System.out.println(dog instanceof Dog);
		System.out.println(dog instanceof Animal);
		
		Cat cat = new Cat();
//		System.out.println("Does cat have chew toy? " + cat.isHasChewToy());
		
		Pug pug = new Pug();
		pug.setName("Ralph");
		
		// user can give pug chew toy
		// CTRL + Shift + O: auto-import
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Do you want to give the pug a chew toy? Y/N");
//		String input = scanner.nextLine();
//		
//		if (input.equals("Y")) {
//			pug.setHasChewToy(true);
//		}
//		
//		System.out.println("Does pug have chew toy? " + pug.isHasChewToy());
		
		System.out.println("---------------------- OBJECT CLASS --------------------");
		System.out.println(anim);
		System.out.println(dog);
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.setName("Fred");
		dog2.setName("Fred");
		dog1.setHasChewToy(true);
		System.out.println(dog1);
		System.out.println(dog2);
		
		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog2));
		
		dog2 = null; // makes the object being de-referenced eligible for garbage collection
		
		System.gc(); // suggest that the garbage collector does its job
		
		System.out.println("---------------------- COVARIANCE --------------------");
		
		Dog dog3 = new Dog();
		Animal anim2 = dog3;
		
		// dog type reference variable can see all dog properties (inherited or defind in class)
		dog3.getCollar();
		dog3.getName();
		dog3.isHasChewToy();
		
		// animal type reference variable can see ONLY animal properties (inherited)
//		anim2.getCollar();
		anim2.getName();
//		anim2.isHasChewToy();
		System.out.println("here");
		anim2.speak();
		anim2 = cat;
		
		Animal[] animals = new Animal[3];
		
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = new Camel();
		
		for (Animal animal : animals) {
			animal.speak();
		}
		
	}
}
