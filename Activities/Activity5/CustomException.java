package com.ltts_activity5;

import java.util.Scanner;

public class CustomException extends Exception {

	public CustomException(String str) {
		super(str);
	}
	
	static void validateIPL_age(String name,int age) throws CustomException{
		if(age<19) {
			throw new CustomException("InvalidAgeRange Custom Exception");
		}
		else
			System.out.println("Name:"+name+"\n Age:"+age);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your Name and age: ");
			validateIPL_age(sc.next(),sc.nextInt());
		}
		catch(CustomException E) {
			System.out.println("Exception found:"+E);
		}
		sc.close();
	}
}
