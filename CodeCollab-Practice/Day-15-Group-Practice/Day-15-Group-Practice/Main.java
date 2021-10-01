
import problem1.DoConversion;
import problem2.UseNovel;
import problem3.UsingArray;
import problem4.MeanClass;
import problem5.UseCar;
import problem6.UseDivision;
import problem7.BadInput;

public class Main {
	public static void main(String[] args) {
		// #1. Exception type: NumberFormatException
        //Guru
        try{
            DoConversion.doConversion();
            
        } catch(Exception e){
            System.out.print("Caught ConverterExceptionis");
            e.printStackTrace();
        }finally {
            System.out.print("conversion exception");
        }

        System.out.println("Problem #1 handled!");
        
		// #2. Exception type:
        //yash
        try{
		    UseNovel.useNovel();
        }
        catch(Exception e) {
            System.out.println("There's an oopsie somewhere.");
            e.printStackTrace();
        }
		System.out.println("Problem #2 handled!");
		
		// #3. Exception type:
        //Guru
        try {
		    UsingArray.usingArray();
        } catch(ArrayIndexOutOfBoundsException e){
             
             e.printStackTrace();
        }finally{
		    System.out.println("Problem #3 handled!");
        }
            System.out.println("Problem #3 handled!");
		// #4. Exception type: MeanException (custom checked exception)
		try {
            MeanClass.meanMethod();
        } catch(Exception e) {
            e.printStackTrace();
        }
		System.out.println("Problem #4 handled!");
		
		// #5. Exception type:
        try {
            UseCar.useCar();
        } catch(Exception e) {
            e.printStackTrace();
        }
		System.out.println("Problem #5 handled!");
		
		 // #6. Exception type:
         //Guru
        
        try{
		    UseDivision.useDivision();
        }catch (ArithmeticException e){
            System.out.println("Caught an arithmetic exception!");
            e.printStackTrace();
        }	finally {
            System.out.println("Problem #6 handled!");
        }
		
		
		// #7. Exception type: IllegalArgumentException
        try {
            BadInput.badInput("");
        } catch(IllegalArgumentException e) {
            e.printStackTrace();
        }
		System.out.println("Problem #7 handled!");
	}
}
