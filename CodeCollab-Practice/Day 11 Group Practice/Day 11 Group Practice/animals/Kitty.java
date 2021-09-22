package animals;

public class Kitty implements Animal {

    String name;

    public void move()
    {
        System.out.println("pitter patter");
    }

    public String getName()
    {
        return this.name;
    }
    
}