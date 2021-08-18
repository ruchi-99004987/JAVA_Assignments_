package Activity_3;
import java.util.*;

public class TestRoomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DeluxeRoom dr=new DeluxeRoom();
		DeluxeACRoom dar= new DeluxeACRoom();
		SuiteACRoom sar= new SuiteACRoom();
		System.out.println("Hotel Tariff Calculator\r\n"
				+ "1. Deluxe Room\r\n"
				+ "2. Deluxe AC Room\r\n"
				+ "3. Suite AC Room\r\n"
				+ "Select Room Type:\r\n");
		int choice = sc.nextInt();
		if(choice ==1) {
			System.out.println("Hotel Name:");
			dr.setHotelName(sc.next());
			System.out.println("Room Square Feet Area:");
			dr.setNumberOfSqFeet(sc.nextInt());
			System.out.println("Room has TV (true/false):");
			dr.setHasTV(sc.nextBoolean());
			System.out.println("Room has Wifi (true/false)");
			dr.setHasWifi(sc.nextBoolean());
			System.out.println("Tariff is:"+dr.calculateTariff());
		}
		else if(choice==2) {
			System.out.println("Hotel Name:");
			dar.setHotelName(sc.next());
			System.out.println("Room Square Feet Area:");
			dar.setNumberOfSqFeet(sc.nextInt());
			System.out.println("Room has TV (true/false):");
			dar.setHasTV(sc.nextBoolean());
			System.out.println("Room has Wifi (true/false)");
			dar.setHasWifi(sc.nextBoolean());
			System.out.println("Rate per square feet is:"+dar.getRatePerSqFeet());
		}
		else {
			System.out.println("Hotel Name:");
			sar.setHotelName(sc.next());
			System.out.println("Room Square Feet Area:");
			sar.setNumberOfSqFeet(sc.nextInt());
			System.out.println("Room has TV (true/false):");
			sar.setHasTV(sc.nextBoolean());
			System.out.println("Room has Wifi (true/false)");
			sar.setHasWifi(sc.nextBoolean());
			System.out.println("Rate per square feet is:"+sar.getRatePerSqFeet());
		}
	}

}
