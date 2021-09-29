package examples.interfaces;

public interface Refillable {
	public abstract void isRefillable();
	
	public default void defaultMethod() {
		System.out.println("this is refillabe's default implementation");
	}
}
