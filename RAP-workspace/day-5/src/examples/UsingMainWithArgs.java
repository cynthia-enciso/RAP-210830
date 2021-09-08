package examples;

public class UsingMainWithArgs {
	
	public static void main(String[] args) {
		for (String argument : args) {
			System.out.println(argument);
		}
		
		System.out.println("using bracket notation: " + args[0]);
	}
}
