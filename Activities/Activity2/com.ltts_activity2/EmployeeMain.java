package Activity_2;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter the name:");
		emp.setName(sc.next());
		System.out.println("Enter Address:");
		emp.setAddress(sc.next());
		System.out.println("Enter Mobile:");
		emp.setMobile(sc.next());
		System.out.println("Employee Details");
		System.out.println("Name:"+emp.getName());
		System.out.println("Address:"+emp.getAddress());
		System.out.println("Mobile:"+emp.getMobile());
		sc.close();
	}

}
