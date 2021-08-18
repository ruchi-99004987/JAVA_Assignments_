package com.ltts;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, product=1, fact=1, number=6;
		System.out.println("**********Practice Programs*****************");
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your ps no:");
		int ps_no=sc.nextInt();
		String str_ps = String.valueOf(ps_no);
		//control statements
		if(age>=18 && str_ps.length()==8) {
			System.out.println("Welcome to JAVA demo programs:)");
		}
		else {
			System.out.println("Sorry!\nNot eligible\nPlease check your ps_no and try again!");
		}
		//for loop
		for(int i=1;i<=5;i++) {
			sum+=i;
		}
			System.out.println("Sum of numbers from 1 - 5 : "+sum);
		//while loop
		while(number!=0) {
				product *=number;
				number--;
		}
		System.out.println(("Product of descending order from 6 - 1 : " +product));
		//do-while loop
		int index=1; int num;
		System.out.println("Enter the number whose factorial you want: ");
		num=sc.nextInt();
		System.out.println("Factorial of "+num+" :");
		do {
			fact=fact*index;
			index++;
		}while(index<=num);
		System.out.println(fact);
		//array implementation
		int array[]=new int[5];
		System.out.println("Enter five array elements:\n");
		for(int j=0;j<array.length;j++) {
			array[j]=sc.nextInt();
		}
		int sum_ar=0;
		for(int j=0;j<array.length;j++) {
			sum_ar+=array[j];
		}
		System.out.println("Sum of array elements:\t"+sum_ar);
		sc.close();
}}
