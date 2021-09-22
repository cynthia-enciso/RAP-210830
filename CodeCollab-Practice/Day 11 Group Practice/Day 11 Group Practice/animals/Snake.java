package animals;

public class Snake extends Animal{

    @override
    public void move() {
        System.out.println("snakes move by slithering");
    }

    @override
    public void speak() {
        System.out.println("snakes speak by hissing");
    }
}