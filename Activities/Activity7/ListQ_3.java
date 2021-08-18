package com.ltts_activity7;
import java.util.*;

public class ListQ_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList <String>l1=new LinkedList<String>();
		LinkedList <String>l2=new LinkedList<String>();
		LinkedList <String>l3=new LinkedList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=0;i<5;i++) {
			l1.add(sc.nextLine());
		}
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int j=0;j<5;j++) {
			l2.add(sc.nextLine());
		}
		
		for(int k=0;k<5;k++) {
			if((l1.contains((l2.get(k))))==true)
				l3.add(l1.get(k));
		}
		//System.out.println(l3);
		Iterator<String>itr=l3.iterator();
		System.out.println("Consistent run scorers");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		sc.close();
	}
}
