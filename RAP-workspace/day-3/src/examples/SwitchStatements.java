package examples;

public class SwitchStatements {
	// enum example
	static enum DAY {
		MONDAY, 
		TUESDAY, 
		WEDNESDAY, 
		THURSDAY, 
		FRIDAY,
		SATURDAY,
		SUNDAY
		}
	
	// https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
			
	public static void main(String[] args) {
		// can support int, char, short, byte, string and enum
		
		int myValue = 5;
		
		switch (myValue) {
			case 5: System.out.println("value was 5!");
					break;
			case 0: System.out.println("value was 0!");
					break;
			case 10: System.out.println("value was 10!");
					break;
			default: System.out.println("value was not what I was looking for");
					break;
		}
		
		int letterGrade = 'C';
		
		switch (letterGrade) {
			case 'C':
			case 'B':
			case 'A':	System.out.println("you pass");
						break;
			case 'D':
			case 'F':	System.out.println("you fail");
						break;
			default:	System.out.println("incorrect input");
		}
		
		DAY myDay = DAY.FRIDAY;
		
		switch (myDay) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
			System.out.println("it's a weekday!");
			break;
		default:
			System.out.println("it's the weekend!");
			break;
		}
		
	}
}
