package animals;

public class Lizards{
    public int legs = 4;
    public String name = "Larry";
    public boolean carnivore;


    public void scared(){
        System.out.println("hsssssss");
    }

    public Lizards(){}

    public Lizards(boolean carnivore){
        this.carnivore = carnivore;
    }
    public Lizards(String name, boolean carnivore){
        this.name = name;
        this.carnivore = carnivore;
    }
}
