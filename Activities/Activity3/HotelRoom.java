package Activity_3;

class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	public HotelRoom() {
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHasTV() {
		return hasTV;
	}
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}
	public int calculateTariff(){
		int tariff = this.getNumberOfSqFeet()*this.getRatePerSqFeet();
		return tariff;
	}
}
