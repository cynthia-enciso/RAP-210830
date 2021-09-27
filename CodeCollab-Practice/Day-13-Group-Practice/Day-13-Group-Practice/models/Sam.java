package models;

public class Sam extends Person {
    
    private int age;
    
    public Sam() {
        this("Null", 0);
    }

    public Sam(String SSN, int age) {
        setSSN(SSN);
        setAge(age);
    }
    //getter and setter
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void read() {
        System.out.println("Sam can read anything");
    }

    public void read(String book) {
        System.out.println("Sam can read " + book);
    }

    
     
}