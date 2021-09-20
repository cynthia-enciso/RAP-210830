
import java.util.*;
public class Main{ 


    public static void main(String[] args){
        // create max and min variables to create your range
        int max = 20;
        int min = 5;
        
        int random = (int)Math.floor(Math.random() * (max - min + 1) + min);
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the guessing Game");
        int guessNumber;
        
        do {
            System.out.println("Guess a random number: ");
            guessNumber = input.nextInt(); 
            
            if(guessNumber == random) {
                System.out.print("congratulations");
                break;
            } else if (guessNumber > random){
                System.out.println(" That's high");
            } else{
                System.out.println(" That's low");
            }

        } while (guessNumber != random);
       
        
        
        
    }
}
