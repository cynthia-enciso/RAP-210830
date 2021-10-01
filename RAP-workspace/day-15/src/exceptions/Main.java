package exceptions;

public class Main {
	public static void main(String[] args) /* throws CheckedException */ {
		System.out.println("Before exceptions");
		
		// dealing with our runtime exception
		try {
			System.out.println(sumOddNumbers(3, 4));
//			return; // finally still occurs
//			System.out.println("After sumOddNumbers called");
		} catch(EvenNumberException e) {
			System.out.println("even number exception caught!");
		} catch(RuntimeException e) {
			System.out.println("runtime exception caught!");
		} catch(Exception e) {
//			e.printStackTrace();
			System.out.println("exception caught!");
		} finally {
			System.out.println("finally!");
		}
		
		// dealing with checked exception
		try {
			anotherMethod();
		} catch (CheckedException e) {
			e.printStackTrace();
		}
		
		try {
			Pen pen = new Pen();
			pen = null;
			pen.setInkColor("");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("After exceptions");
	}
	
	// will potentially throw unchecked exception
	public static int sumOddNumbers(int num1, int num2) {
		if (num1 % 2 == 0) {
			throw new EvenNumberException("first input is even");
		} else if (num2 % 2 == 0) {
			throw new EvenNumberException("second input is even");
		}
		
		return num1 + num2;
	}
	
	// will potentially throw checked exception
	public static void anotherMethod() throws CheckedException {
		throw new CheckedException();
	}
}
