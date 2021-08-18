package Activity_2;
import java.util.*;
public class EmployeeMain_Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee_Q5 emp1 = new Employee_Q5();
		System.out.println("Enter the name:");
		emp1.setName(sc.nextLine());
		System.out.println("Enter Address:");
		emp1.setAddress(sc.next());
		System.out.println("Enter Mobile:");
		emp1.setMobile(sc.next());
		System.out.println("Employee Details");
		System.out.println("Name:"+emp1.getName());
		System.out.println("Address:"+emp1.getAddress());
		System.out.println("Mobile:"+emp1.getMobile());
		int choice;
do{		
		System.out.println("Verify and Update the details:\r\n"
				+ "Menu\r\n"
				+ "1.	Update Employee name\r\n"
				+ "2.	Update Employee Address\r\n"
				+ "3.	Update Employee mobile\r\n"
				+ "4.	All information correct/Exit\r\n"
				+ "Any other number to Exit");
		 choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Current name is:"+emp1.getName());
				System.out.println("Name:");
				emp1.setName(sc.next());
				break;
		case 2: System.out.println("Current Address:"+emp1.getAddress());
				System.out.println("Address:");
				emp1.setAddress(sc.next());
				break;
		case 3: System.out.println("Current Mobile:"+emp1.getMobile());
				System.out.println("Mobile:");
				emp1.setMobile(sc.next());
				break;
		case 4: System.out.println("The details are:");
				System.out.println("Name:"+emp1.getName()
				+"\nAddress:"+emp1.getAddress()
				+"\nMobile:"+emp1.getMobile());
				break;
		}
}while(choice>0 && choice<=4);
sc.close();
	}
}
