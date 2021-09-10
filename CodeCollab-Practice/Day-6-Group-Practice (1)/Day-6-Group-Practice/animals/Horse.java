package animals;

public class Horse {

    // 2 properties
    public String color = "red";
    public int age;
    
    public Horse() { // constructor
        System.out.println("Horse eats hay.");
    }

    public void setAge(int horseAge) { // setter method
        age = horseAge;
    }

    public void getAge() { // getter method
        System.out.println("The horse is " + age + "years old.");
    }
}