// add your imports here
import animals.*;
// import Falcon;
// import Cat;
// import cat;
// import Kitty;
// import Snake;
// import dog;

//is it possible to just do import animals.* ?

public class Main {

    // main method
    public static void main(String[] args) {
        
        Animal a = new dog();
        a.speak();
        
        Animal b = new Cat();
        b.eat();

        Animal z = new Falcon();
        z.speak();
        z.eat();
        z.setName("Teal");
        
        System.out.println(z.getName() + " is a Falcon, listen to him speak: " +z.speak() );


        Animal c = new cat();
        c.eat();

        Animal s = new Snake();
        s.move();
        
        Animal hippo = new Hippo();
        hippo.move();

        Animal k = new Kitty();
        k.move();
    }

}