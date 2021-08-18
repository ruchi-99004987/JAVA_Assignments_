package com.ltts_activity8;
import java.util.*;
public class SetQ_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet <String>s1=new HashSet<String>();
		System.out.println("Enter number of matches:");
		int n =sc.nextInt();
		System.out.println("Enter the player names who have won player of the match title");
		for(int i=0;i<=n;i++) {
			s1.add(sc.nextLine());
		}
		System.out.println(s1);
		Iterator<String>itr=s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		sc.close();
	}

}
