// import your class here
import animals.Eagle;
import items.Keychain;
import animals.Cat;
import animals.Horse;
import animals.Penguin;
import animals.Lion;
import animals.Bear;
import animals.Falcon;
import animals.Lizards;
//import items.Tags;

public class Main {
    public static void main(String[] args) {
        // create an object of your class here
        Cat  cat = new Cat();
        cat.name = "Sandy";
        
        Cat cat2 = new Cat("jerrry", "black", 2, false );
        
        Penguin p1 = new Penguin("Marco", 70, 60, "Flounder");

        Eagle eagle = new Eagle("Bob");
        Keychain keys = new Keychain("Billy", 5);
        System.out.println(keys.owner + ":");
        keys.lostKeys();

        Falcon falcon1 = new Falcon("Jerry", 5, 10);
        System.out.println(falcon1);
        
        Bear bear = new Bear("green", "1000lbs");
        System.out.println(bear);
        
        Lion lion1 = new Lion("Sam", 6);
        
        Horse horse1 = new Horse();
        horse1.setAge(10);
        horse1.getAge();
        
        Lizards liz1 = new Lizards("Jerry", false);
        System.out.println(liz1);
        
    }
}

    
