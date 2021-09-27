package models;

public class Student extends Person {

    private String name;

 
    public Student(String SSN, String name){
        this.setSSN(SSN);
        this.name = name;
    }
    public Student(){ 
        this("default-SSN", "default name"); 
    }

    public void read(){
        System.out.print(this.name + "go to college");
    }

    //getter
    public String getName(){
        return this.name;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }

}
