package models;

public class sarah extends Person {
    private String firstName;
    private String lastName;
    private int SID;



    public sarah(){
        this("Default firstName", "Default lastName", 0); 
    }

   
    public sarah(String firstName){
        this(firstName, "Default lastName", 0);
    }

    public sarah(String firstName, String lastName){
        this(firstName, lastName, 0);
    }

    public sarah(String firstName, String lastName, int SID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SID = SID;

    }


    public void study(){
        System.out.println("This person" +  firstName + " is studying");
    }

    public void study(String subject){
        System.out.println("This person" + firstName + " is studying " + subject);
    }



}