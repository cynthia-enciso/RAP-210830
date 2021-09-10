package animals;

public class Eagle {
    public int wingspan;
    public char gender;
    public String name = "Uncle Sam";

    public Eagle(){
        System.out.println("This is an eagle.");
    }

    public Eagle(int wingspan){
        this.wingspan = wingspan;
    }

    public Eagle(char gender){
        this.gender = gender;
    }

    public Eagle(String name){
        this.name = name;
    }

    public Eagle(int wingspan, char gender, String name){
        this.wingspan = wingspan;
        this.gender = gender;
        this.name = name;
    }

    public void fly(){
        System.out.println("Wing flapping sounds");
    }
}