package Activity_2;
import java.util.*;
public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cus=new Customer();
		String str,str1,str2,str3;
		System.out.println("Enter the details:");
		cus.setName(sc.next());
		//cus.setAddress(sc.next());
		//cus.setMobile(sc.next());
		str1=cus.getName(); //str2=cus.getAddress(); str3=cus.getMobile();
		//str=str1+","+str2+","+str3;
		String[] stringarray = str1.split(",");
		for(int i=0; i< stringarray.length; i++)  
		{  
		//prints the tokens  
		System.out.println(stringarray[i]);  
		}  
		sc.close();
	}

}
