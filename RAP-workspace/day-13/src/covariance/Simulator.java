package covariance;

public class Simulator {
	public static void main(String[] args) {
		Bear bear = new Bear("Yogi");
		bear.hibernate();
		
		Animal animal = new Bear("Koda");
		((Bear) animal).hibernate();
		
		Animal animal2 = new Shark("Sharky");
//		((Bear) animal2).hibernate(); // creates a runtime exception
		
		// when casting from a parent class to a subclass, check first
		if (animal2 instanceof Bear) {
			((Bear) animal2).hibernate();
		} else {
			System.out.println("Is an animal, but not a bear!");
		}
		
		Animal[] animalArray = new Animal[4];
		
		// another example of something we can do
		animalArray[0] = new Bear("Koda");
		animalArray[1] = new Shark("Sharky");
		animalArray[2] = new Platypus("Platty");
		animalArray[3] = new Capybara("Cappy");
		
		for (Animal anim : animalArray) {
			anim.eat();
		}
	}
}
