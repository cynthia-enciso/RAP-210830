package Ivan;

public class Dog extends Animal implements Sellable {
    public void speak() {
        System.out.println("Woof Woof");
    }

    public void isSellable () {
        System.out.println("Dog is sellable");
    }
}