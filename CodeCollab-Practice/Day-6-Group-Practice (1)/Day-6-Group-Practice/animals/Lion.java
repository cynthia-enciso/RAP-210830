package animals;

public class Lion {
    public String name;
    public int age;

    public Lion(){}

    public Lion(String name){
        this.name = name;
    }
    
    public Lion (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void bark(){
        System.out.println("Roar");
    }

}