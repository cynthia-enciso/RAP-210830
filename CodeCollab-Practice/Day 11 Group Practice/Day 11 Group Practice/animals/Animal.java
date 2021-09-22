package animals;

public class Animal {
    // fields
    private String name;

    // constructors

    // methods
    public void eat() {
        System.out.println("*generic eating");
    }

    public void move() {
        System.out.println("*genericly moving around");
    }

    public void speak() {
        System.out.println("*generic animal noises");
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}