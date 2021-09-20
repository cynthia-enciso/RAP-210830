package math;

import java.util.Random;

public class UsingMath {
	public static void main(String[] args) {
		System.out.println("\n------------------ Math Fields -------------------------");
		System.out.println("E: " + Math.E);
		System.out.println("PI: " + Math.PI);
		
		System.out.println("\n------------------ Math Methods -------------------------");
		// abs
		System.out.println("Abs: " + Math.abs(-100)); // ints, floats, doubles, long
		
		// floor, ceiling, round
		System.out.println("number rounded down: " + Math.floor(4.7)); // 4
		System.out.println("number rounded up: " + Math.ceil(14.3)); // 15
		System.out.println("number rounded either up or down " + Math.round(4.7)); // 5
		System.out.println("number rounded either up or down " + Math.round(14.3)); // 14
		
		// max/min
		System.out.println("larger of the two: " + Math.max(5, 4)); // 5
		System.out.println("smaller of the two: " + Math.min(5, 4)); // 4
		
		// sqrt, pow
		System.out.println("square root of 64: " + Math.sqrt(64));
		System.out.println("exponentation example: " + Math.pow(2, 6));
		
		// Math.random
		int max = 20;
		int min = 5;
		
		// range is currently between 0 and 1 (exclusively)
		System.out.println("Random number between 0 and 1 (with decimals): " 
							+ Math.random());

		// range becomes 0 - max (exclusively)
		System.out.println("Random number between 0 and " + max + " (with decimals): " 
							+ (Math.random() * max));
		
		// range becomes min - max (exclusively)
		System.out.println("Random number between " + min + " and " + max + " (with decimals): " 
							+ ((Math.random() * (max - min)) + min));		
												// our range, starting with min and ending before max
		// range becomes min - max (inclusive)
		System.out.println("Random number between " + min + " and " + max + " (with decimals):" 
							+ ((Math.random() * (max - min + 1)) + min));		
												// our range, starting with min and ending at max
		// use math.floor to remove decimals
		System.out.println("Random number between "+ min +" and " + max + " (without decimals):" 
							+ Math.floor((Math.random() *( max - min + 1)) + min));
		
		// Random.nextInt
		Random random = new Random();
		
		System.out.println("Random number between "+ min +" and " + max + " (without decimals):" 
				+ (random.nextInt(max - min + 1) + min));	
		
		// if your range starts with 1, it's a little simpler.
		min = 1;
		
		System.out.println("Random number between "+ min +" and " + max + " (without decimals):" 
				+ (random.nextInt(max) + min));
	}
}
