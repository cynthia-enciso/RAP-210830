package cable;

public class Main {
	public static void main(String[] args) {
		Pluggable myCurrentCable = new LaptopCharger();
		System.out.println(myCurrentCable.fitsIntoUSBPort());
		
		myCurrentCable = new PhoneCharger();
		System.out.println(myCurrentCable.fitsIntoUSBPort());
	}
}
