package animals;

public class Hippo extends Animal{
    private String name;
    private String description;
    private double weight;

    @Override
    public void eat() {
        System.out.println("*hippo eating");
    }

    @Override
    public void move() {
        System.out.println("*hippo moving");
    }

    public void setName(String s){this.name = s;}
    public void setWeight(double d){this.weight = d;}

    public String getName(){return this.name;}
    public double getWeight(){return this.weight;}
}