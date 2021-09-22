package animals;

public class Falcon extends Animal{

    private String name;

@Override
public void eat(){

    System.out.println("Falcons mostly eat vermin");
}

@Override
 public void speak() {
        System.out.println("*CAAWWWWW!!!");

    }

 public getName() {
        return this.name;
    }

    public setName(String name) {
        this.name = name;
    }




}