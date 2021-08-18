package Activity_3;

class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet ;

	public SuiteACRoom() {
		super();
		this.ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet(){
		if(isHasWifi()==true)
		return ratePerSqFeet+2;
		else
			return ratePerSqFeet;
	}
}
