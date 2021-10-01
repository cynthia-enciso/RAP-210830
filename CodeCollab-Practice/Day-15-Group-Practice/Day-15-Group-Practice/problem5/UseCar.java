package problem5;

public class UseCar {
	public static void useCar() {
		Vehicle myVehicle = new Truck();
		((Car) myVehicle).honk();
	}
}
