package exceptions;

@SuppressWarnings("serial")
public class EvenNumberException extends RuntimeException {
	
	public EvenNumberException(String message) {
		super(message);
	}
}
