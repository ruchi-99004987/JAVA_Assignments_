package Activity_3;
import java.util.*;

class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public Vehicle() {
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public void displayMake() {
		System.out.println("Vehicle Make:\n"+this.make);
	}
	public void displayBasicInfo(){
		System.out.println("Vehicle Number: "+this.vehicleNumber);
		System.out.println("Fuel Capacity: "+this.fuelCapacity);
		System.out.println("Fuel Type: "+this.fuelType);
		System.out.println("CC: "+this.cc);
	}
	public void displayDetailInfo() {
		
	}
}

class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;

	public TwoWheeler() {
		super();
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo() {
		System.out.println("Kick Start Available: "+this.isKickStartAvailable());
	}
}

class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors ;
	public FourWheeler() {
		super();
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailInfo() {
		System.out.println("Audio System:"+this.getAudioSystem());
		System.out.println("Number of Doors: "+this.getNumberOfDoors());
	}
	
}

public class TestVehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Four Wheeler\r\n"
				+ "2.Two Wheeler\r\n");
		System.out.println("Enter Vehicle Type:");
		int choice=sc.nextInt();
		//Vehicle veh = new Vehicle();
		TwoWheeler obj1 = new TwoWheeler();
		FourWheeler obj2=new FourWheeler();
		if(choice==2) {
			System.out.println("Vehicle Make:");
			obj1.setMake(sc.next());
			System.out.println("Vehicle Number:");
			obj1.setVehicleNumber(sc.next());
			System.out.println("Fuel Type:\r\n"
					+ "1.Petrol\r\n"
					+ "2.Diesel\r\n");
			obj1.setFuelType(sc.next());
			System.out.println("Fuel Capacity:");
			obj1.setFuelCapacity(sc.nextInt());
			System.out.println("Engine CC:");
			obj1.setCc(sc.nextInt());
			System.out.println("Kick Start Available(true/false):");
			obj1.setKickStartAvailable(sc.nextBoolean());
			System.out.println("************"+obj1.getMake()+"************");
			System.out.println("---Basic Information---");
			obj1.displayBasicInfo();
			System.out.println("---Detail Information---");
			obj1.displayDetailInfo();
		}
		else {
			System.out.println("Vehicle Make:");
			obj2.setMake(sc.next());
			System.out.println("Vehicle Number:");
			obj2.setVehicleNumber(sc.next());
			System.out.println("Fuel Type:\r\n"
					+ "1.Petrol\r\n"
					+ "2.Diesel\r\n");
			obj2.setFuelType(sc.next());
			System.out.println("Fuel Capacity:");
			obj2.setFuelCapacity(sc.nextInt());
			System.out.println("Engine CC:");
			obj2.setCc(sc.nextInt());
			System.out.println("Audio System:");
			obj2.setAudioSystem(sc.next());
			System.out.println("Number of Doors:");
			obj2.setNumberOfDoors(sc.nextInt());
			System.out.println("************"+obj2.getMake()+"************");
			System.out.println("---Basic Information---");
			obj2.displayBasicInfo();
			System.out.println("---Detail Information---");
			obj2.displayDetailInfo();
		}
       sc.close();
	}

}
