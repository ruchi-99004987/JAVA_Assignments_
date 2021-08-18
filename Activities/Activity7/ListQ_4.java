package com.ltts_activity7;
import java.util.*;

public class ListQ_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList <Integer> l1=new LinkedList<Integer>();
		System.out.println("Enter the number of matches played by Gayle:");
		int num=sc.nextInt();
		System.out.println("Enter his scores in all matches:");
		for(int i=0;i<num;i++) {
			l1.add(sc.nextInt());
		}
		int count1=0,count2=0;
		
		for(int j=0;j<num;j++) {
			if(l1.get(j)>=50&&l1.get(j)<100)
				count1++;
			else if(l1.get(j)>=100)
				count2++;
		}
		System.out.println("Number of 50's:"+count1);
		System.out.println("Number of 100's:"+count2);
		sc.close();
	}

}
