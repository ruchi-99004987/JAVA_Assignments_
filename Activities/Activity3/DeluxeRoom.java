package Activity_3;

public class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;

	public DeluxeRoom() {
		super();
		this.ratePerSqFeet = 10;
	}
	public int getRatePerSqFeet() {
		if(this.isHasWifi()==true) {
			return ratePerSqFeet+2;
		}
		else
		return ratePerSqFeet;
	}
}
