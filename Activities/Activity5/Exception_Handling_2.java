package com.ltts_activity5;
import java.io.*;
public class Exception_Handling_2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int overs = 0;
		try {
			System.out.println("Enter the number of overs: ");
			overs=Integer.parseInt(br.readLine());
			System.out.println("Enter the number of runs for each over: ");
			int runs[]=new int[overs];
			int MAX=0;
			for(int i =1;i<=runs.length;i++) {
				runs[i]=Integer.parseInt(br.readLine());
				if(runs[i+1]>runs[i])
					MAX=runs[i+1];
			}
			System.out.println("Enter the over number:");
			int over_no=Integer.parseInt(br.readLine());
			System.out.println("Runs scored in this over :"+MAX);
		}
		catch(java.lang.NegativeArraySizeException|java.lang.ArrayIndexOutOfBoundsException  e) {
				System.out.println(e);
				}

	}

}
