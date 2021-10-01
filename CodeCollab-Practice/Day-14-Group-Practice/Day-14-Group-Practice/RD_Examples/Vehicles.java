package RD_Examples;

//import interfaces


public abstract class Vehicles{

 public String brand;

 public byte mpg;



 public Vehicles(){

 }


 public String getBrand(){

     return this.brand;
 }

 public void setBrand(String brand){
     this.brand = brand;
 }

 public byte getMpg(){
     return this.mpg;

 }

 public void setMpg(byte mpg){

     this.mpg = mpg;
 }

public abstract void drive();
    
 



}