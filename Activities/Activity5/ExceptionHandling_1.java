package com.ltts_activity5;

import java.io.*;

public class ExceptionHandling_1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter the total runs scored :");
		int runs_scored=Integer.parseInt(br.readLine());
		System.out.println("Enter the total overs faced:");
		int overs=Integer.parseInt(br.readLine());
		int run_rate=runs_scored/overs;
		System.out.println("Current Run Rate : "+run_rate);
		}
		catch (java.lang.ArithmeticException|java.lang.NumberFormatException e){
			System.out.println(e);
		}
	}

}
