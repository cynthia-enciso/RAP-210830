public class Main{
    static int vowels = 0;

    
    public static int counter(String word) {
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')  {
                vowels += 1;
            }
        }
        return vowels;  
    }
    
    public static void main(String[] args){
        String str = "supercalifragilisticexpialidocious";
        str = str.toLowerCase();
        int x = counter(str);
        System.out.println("Total no of vowels in strings are : " + x);

    }   
}