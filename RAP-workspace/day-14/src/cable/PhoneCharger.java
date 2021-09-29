package cable;

public class PhoneCharger implements Pluggable {

	@Override
	public boolean fitsIntoUSBPort() {
		return true;
	}

}
