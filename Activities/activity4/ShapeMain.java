package com.ltts_activity4;
import java.util.*;
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Circle\r\n"
				+ "Square\r\n");
		Shape s1=new Circle();
		Shape s2=new Square();
		System.out.println("Enter the shape");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("Circle")) {
			System.out.println("Enter the radius");
			int rad=sc.nextInt();
			System.out.println("Area of circle is: "+s1.calculateArea(rad));
		}
		else if(choice.equalsIgnoreCase("Square")){
			System.out.println("Enter the side");
			int side=sc.nextInt();
			System.out.println("Area of Square is: "+s2.calculateArea(side));
		}
		else
			System.out.println("Invalid Input");
	}

}
