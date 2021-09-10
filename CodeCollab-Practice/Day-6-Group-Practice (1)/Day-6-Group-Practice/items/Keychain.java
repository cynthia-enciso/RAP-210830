package items;

public class Keychain {
    public int totalKeys = 1;
    public String owner;

    public Keychain(){
        System.out.println("Oh look, there's a keychain.");
    }

    public Keychain(int totalKeys){
        this.totalKeys = totalKeys;
    }

    public Keychain(String owner, int totalKeys){
        this.owner = owner;
        this.totalKeys = totalKeys;
    }

    public void lostKeys(){
        System.out.println("Has anybody seen my keys?");
    }

    public void foundKeys(){
        System.out.println("Whose keys are these?");
    }

}