// imports here
import models.*;
//no need to import every single one of ur files if u just import all.

public class Main {
    // main method
    public static void main(String[] args) {
        // create two objects from your class (each call using a different constructor)

         Naruto naruto = new Naruto();


         Naruto boruto = new Naruto("123-12-3456", "Boruto");



        // call your method twice (each call with a different parameter list)

        naruto.Ninjutsu();
        boruto.Ninjutsu("123-12-3456","Boruto");


        Sam s1 = new Sam();
        Sam s2 = new Sam("333-333-3333", 20);
        s1.read();
        s2.read("Harry Potter");


        Student studenOne = new Student();
        Student strudentTwo = new Student("123-333-4566", "Guru");
        

        Employee e1 = new Employee();
        Employee e2 = new Employee("111-11-1111", 30, "Cole");
        e1.workWeek();
        e2.workWeek(40);


        sarah s = new sarah();
        sarah ssss = new sarah("ss", "ee", 1234);
        s.study();
        ssss.study("bio");

    }
}