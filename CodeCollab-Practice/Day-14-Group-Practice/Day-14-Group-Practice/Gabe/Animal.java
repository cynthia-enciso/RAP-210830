package Gabe;

public abstract class Animal{
    private String name;

    public String getName(){return this.name;}
    public abstract void whatItEats();
    public void setName(String str){this.name = str;}

}