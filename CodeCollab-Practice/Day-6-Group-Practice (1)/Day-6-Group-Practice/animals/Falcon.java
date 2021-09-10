package animals;

public class Falcon{



public String name;
public int age;
public float wingspan;

public Falcon(){



}



public Falcon(String name){

    this.name = name;

    
}

public Falcon(String name, int age){
    this.name = name;
    this.age = age;
}


public Falcon (String name, int age, float wingspan){


    this.name = name;
    this.age = age;
    this.wingspan = wingspan;

}

public void Caw(){

    System.out.println("Falcon has cawed");
}






}