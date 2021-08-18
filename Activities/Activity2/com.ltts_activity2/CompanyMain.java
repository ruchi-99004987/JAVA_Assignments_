package Activity_2;
import java.util.*;
public class CompanyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Company com = new Company();
		System.out.println("Enter the company name:");
		com.setName(sc.nextLine());
		System.out.println("Enter the employees:");
		com.setEmployees(sc.nextLine());
		System.out.println("Enter TeamLead:");
		com.setTeamlead(sc.next());
		String s1=com.getTeamlead();
		String s2=com.getEmployees();
		String[] s3 = s2.split(",");
		String s4=com.getName();
		int flag=0;
		for(int i =0;i<s3.length;i++) {
			if(s3[i].equalsIgnoreCase(s1)) {
				flag=1;
				break;
			}
		}
			if(flag==1) {
				System.out.println("Name:"+s4+"\nEmployees:"+s2+"\nTeamLead:"+s1);
			}
			else
				System.out.println("Invalid Input");
		sc.close();
	}

}
