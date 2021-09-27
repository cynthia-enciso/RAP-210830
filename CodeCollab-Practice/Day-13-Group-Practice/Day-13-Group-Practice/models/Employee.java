package models;

public class Employee extends Person{

    private int hoursWorked;
    private String name;

    public Employee(){
        this("default-SSN", 0, "default-name");
    }

    public Employee(String SSN, int hours, String name){
        this.setSSN(SSN);
        this.hoursWorked = hours;
        this.name = name;
    }
    
    //thank you

    public int getHours(){
        return this.hoursWorked;
    }

    public void setHours(int hours){
        this.hoursWorked = hours;
    }

    public String getName(){
        return this.name;
    } 

    public void setName(String name){
        this.name = name;
    }

    public void workWeek(){
        System.out.println("Employee: " + this.getName() + " has worked " + this.getHours() + " hours this week");
    }

    public void workWeek(int over){
        if (this.getHours() > over){
        System.out.println("Employee: " + this.getName() + " has worked " + this.getHours() + " hours this week. Which is now overtime.");
        }else {
            System.out.println("Employee: " + this.getName() + " has worked " + this.getHours() + " hours this week. Which is not overtime.");
        }
    }
    
    
}