package examples.interfaces;

public interface Purchasable {
	// inherently public static final 
	double LOWEST_COST = 0.01;
	
	// inherently public abstract 
	void isPurchasable();
	
	
	public default void defaultMethod() {
		System.out.println("this is purchasable's default implementation");
	}
}
