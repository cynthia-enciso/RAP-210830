package cable;

public class LaptopCharger implements Pluggable {

	@Override
	public boolean fitsIntoUSBPort() {
		return true;
	}

}
