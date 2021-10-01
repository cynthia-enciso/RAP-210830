package RD_Examples;

public class Car extends Vehicles implements Speeds {


public void setBrand(String brand){
    this.brand = brand;
}

public void setMpg(byte mpg){
    this.mpg = mpg;
}

public void drive(){

    System.out.println("*Drives Honda**");
}

// public boolean
public boolean isSpeeding(boolean isTrue) {
    return isTrue;
}   
}
