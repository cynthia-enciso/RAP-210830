import models.Students;
import models.Sample;
import models.Person;
import models.Tables;
import models.Employee;
import models.car;
import models.Name;


public class Main {

    // private String name;
    public static void main (String [] args){
        

        Students student = new Students();
        
        System.out.println(student.getStudID());

        student.setStudID(8910);
        System.out.println(student.getStudID());

        // Guru's code
        Employee employee  = new Employee();
        employee.setName("John Cina");
        System.out.println(employee.getName());

        // Yash
        Sample sample1 = new Sample();
        sample1.setI(5); // initial value of i was 1. changing to 5.
        sample1.getI(); // displaying value i.


        // needs parentheses after second Name to call constructor
        Name N = new Name();
        N.setName("Sahar");
        System.out.println(N.getName());
        
        //Cole
        Person person = new Person();
        person.setAge(30);
        System.out.println(person.getAge());
        
        Tables table = new Tables();
        System.out.println(table.getSetting());


        car c = new car(2020);
        System.out.println(c.getYear());
        c.setYear(2019);
        System.out.println(c.getYear());
    }
    
    // We Don't need constructor for Main I think
    // constructor
    // public Main(){
    
    // }

    // public String getName(){
    //     return name;
    // }

    
}