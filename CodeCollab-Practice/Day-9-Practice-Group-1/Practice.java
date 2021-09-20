import java.io.*;
import java.util.*;

//yash d
public class Practice {

    public static void main (String args[]) {
        int min = 1;
        int max = 10;
        System.out.println("Pick a number between" + min + " & " + max + ": \n");

        int x = Math.floor((Math.random() *( max - min + 1)) + min);

        Scanner userInput = new Scanner(System.in);
        int user = 0; //initializing user input variable

        while (user != x){
            user = userInput.nextInt();
            if (user == x) {
                System.out.println("You got it.");
                break;
            }
            else {
                System.out.println("Try again. \n");
            }
        }
        userInput.close();
    }
}