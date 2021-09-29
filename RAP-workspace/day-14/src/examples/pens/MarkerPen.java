package examples.pens;

import examples.interfaces.Purchasable;
import examples.interfaces.Refillable;

public class MarkerPen extends Pen implements Purchasable, Refillable {

	@Override
	public void write() {
		System.out.println("*scribbles roughly with ink*");
	}

	@Override
	public void isRefillable() {
		System.out.println("Markerpen is refillable");
	}

	@Override
	public void isPurchasable() {
		System.out.println("Markerpen is purchasable");
	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		Purchasable.super.defaultMethod();
	}

	

}
