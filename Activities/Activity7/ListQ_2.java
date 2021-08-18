package com.ltts_activity7;
import java.util.*;

public class ListQ_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList <String> l1=new LinkedList<String>();
		System.out.println("Enter the names of top 5 teams of IPL season 13:");
		for(int i=0;i<5;i++) {
			l1.add(sc.nextLine());
		}
		System.out.println("Enter 1st swap positons");
		int pos1=sc.nextInt();
		String s1=l1.get(pos1);
		System.out.println("Enter 2nd swap positons");
		int pos2=sc.nextInt();
		String s2=l1.get(pos2);
		l1.set(pos1, s2);
		l1.set(pos2, s1);
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		sc.close();
	}

}
