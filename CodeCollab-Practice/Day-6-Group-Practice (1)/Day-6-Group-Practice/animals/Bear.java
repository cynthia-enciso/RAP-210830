package animals;

public class Bear
{
    // had these as a "string" instead of "String"
    String color = "brown";
    String weight = "500lbs";

    public Bear()
    {
        // had a missing semicolon
        System.out.println("Bear Constructor");
    }

    public Bear(String color, String weight)
    {
        this.color = color;
        this.weight = weight;
    }

    // public static void main(String[] args)
    // {
    //     Bear bear = new Bear();
    //     System.out.println(bear.color)
    //     System.out.println(bear.weight)

    //     Bear bear2 = new Bear("green", "1000lbs");
    //     System.out.println(Bear.bear2);

    // }

    
}