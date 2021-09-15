public class Main {
    // i am thinking of just using a for loop to loop through the string
    //yeah thats how i woudve done it 
    // would it be easier to convert the string into an array of char?
    //probably 
    public static void main(String[] args) {
        String str = "supercalifragilisticexpialidocious";
        int vowelCount = 0;
        vowelCount = count(str);

        System.out.println("The word supercalifragilisticexpialidocious has "
                             + vowelCount + " vowels in it");
    }

    public static int count(String str) {
        int count = 0;
    
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o'
                || arr[i] == 'u'){
                    count++;
            }      
        }

        return count;
    }
}