package models;

public class Naruto extends Person{
  
       public String name;


    public Naruto(){
        this("default-SSN", "default-name");
    }

    public Naruto(String SSN, String name){
        this.setSSN(SSN);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public void Ninjutsu(){

        System.out.println("** Uses Rasengan**");
    
    }

    // overloaded ninjutsu

     public void Ninjutsu(String SSN, String name){

        System.out.println("** Uses Vanishing Rasengan**");
    
    }
}

    
