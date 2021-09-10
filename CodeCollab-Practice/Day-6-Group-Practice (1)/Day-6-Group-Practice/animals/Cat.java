package animals;

public class Cat {
    public String name;
    public String color;
    public int age;
    public boolean  hasStripe;
//Noargs construnctor
    public Cat(){}
 // 
    public Cat(String name){
        this.name = name;
    }  

    public Cat(String name, String color){
      this.name = name;
      this.color = color;
    }  

    public Cat(String name, String color, int age){
      this.name = name;
      this.color = color;
      this.age = age;
    }  

    public Cat(String name, String color, int age, boolean hasStripe){
      this.name = name;
      this.color = color;
      this.age = age;
      this.hasStripe = hasStripe;
    }  

    public void bark(){
        System.out.println("Meow");
    }

}