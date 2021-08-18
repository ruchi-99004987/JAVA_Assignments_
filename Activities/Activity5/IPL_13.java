package com.ltts_activity5;
import java.util.*;
import java.io.*;
public class IPL_13 extends Exception{

	public IPL_13(String str) {
		super(str);
	}
	
	static String teamname_array[]= {"Chennai Super Kings","Sun Risers Hyderabad"
							, "Delhi Capitals", "Kings XI Punjab", "Kolkata Knight Riders"
							, "Mumbai Indians", "Rajasthan Royals","Royal Challengers Bangalore"};
	static void winnerIPL_13(String name1, String name2) throws IPL_13{
		for(int i=0;i<teamname_array.length;i++) {
			if(teamname_array[i].equalsIgnoreCase(name1)){
				throw new IPL_13("Expected IPL Season 13 winner: Delhi Capitals");
			}
			else if(teamname_array[i].equalsIgnoreCase(name2))
				throw new IPL_13("Expected IPL Season 13 runner: Kolkata Knight Riders");
			else 
				throw new IPL_13("Invalid");
		}
		
	}
//		if((name.equalsIgnoreCase("Chennai Super Kings"))
//				||(name.equalsIgnoreCase("Sun Risers Hyderabad"))
//				|| (name.equalsIgnoreCase("Delhi Capitals"))
//				|| (name.equalsIgnoreCase("Kings XI Punjab"))
//				|| (name.equalsIgnoreCase("Kolkata Knight Riders"))
//				|| (name.equalsIgnoreCase("Mumbai Indians"))
//				|| (name.equalsIgnoreCase("Rajasthan Royals"))
//				|| (name.equalsIgnoreCase("Royal Challengers Bangalore")))
//			throw new IPL_13("Expected IPL Season 13 winner: Delhi Capitals");
//		throw new IPL_13("Expected IPL Season 13 runner: Kolkata Knight Riders");
//	}
//	static void runnerIPL_13(String teamname) throws IPL_13{
//		if((teamname.equalsIgnoreCase("Chennai Super Kings"))
//				||(teamname.equalsIgnoreCase("Sun Risers Hyderabad"))
//				|| (teamname.equalsIgnoreCase("Delhi Capitals"))
//				|| (teamname.equalsIgnoreCase("Kings XI Punjab"))
//				|| (teamname.equalsIgnoreCase("Kolkata Knight Riders"))
//				|| (teamname.equalsIgnoreCase("Mumbai Indians"))
//				|| (teamname.equalsIgnoreCase("Rajasthan Royals"))
//				|| (teamname.equalsIgnoreCase("Royal Challengers Bangalore")))
//		throw new IPL_13("Expected IPL Season 13 runner: Kolkata Knight Riders");
//	}
	
	public static void main(String args[]) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Chennai Super Kings\r\n"
					+ "Sun Risers Hyderabad\r\n"
					+ "Delhi Capitals\r\n"
					+ "Kings XI Punjab\r\n"
					+ "Kolkata Knight Riders\r\n"
					+ "Mumbai Indians\r\n"
					+ "Rajasthan Royals\r\n"
					+ "Royal Challengers Bangalore\r\n");
			System.out.println("Enter the expected winner and runner team of IPL Season 13");
			winnerIPL_13(br.readLine(), br.readLine());
//			System.out.println("Enter the expected runner Team of IPL Season 13");
//			runnerIPL_13(br.readLine());
		}
		catch(IPL_13 e) {
			System.out.println("TeamNameNotFoundException: "
					+ "Entered team is not a part of IPL Season 13");
		}
	}
}
