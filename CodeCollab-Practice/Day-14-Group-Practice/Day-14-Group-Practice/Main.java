// imports here
import Ivan.*;
import Cole.*;
import Examples.*;
import Gabe.*;
import RD_Examples.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
        dog.isSellable();
    

        Phone phone = new Phone();
        phone.isCharged(true);
        phone.isTurnedOn(true);
    
        Developer develop = new Developer();
        develop.doWork();
        develop.setName("Guru");

        Human human = new Human();
        human.move();

        // change to car type
        Car  civic = new Car();
        civic.drive();
        civic.isSpeeding(true);
    
    }
}