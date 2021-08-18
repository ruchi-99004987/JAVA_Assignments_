package com.ltts_activity7;
import java.util.*;
public class ListQ_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1=new LinkedList();
		System.out.println("Enter the player details:");
		System.out.println("Enter player name:");
		l1.add(sc.next());
		System.out.println("Enter age:");
		l1.add(sc.nextInt());
		System.out.println("Enter Country:");
		l1.add(sc.next());
		//System.out.println(l1);
		Iterator itr1 = l1.iterator();
		System.out.println("Player Details:");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Enter Skill");
		String s1=sc.next();
		System.out.println("Enter the position to add the skill");
		int pos=sc.nextInt();
		l1.set(pos, s1);
		System.out.println("Player Details:");
		Iterator itr2 = l1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("Enter the position of the detail to be removed ");
		int position=sc.nextInt();
		l1.remove(position);
		System.out.println("Player Details:");
		Iterator itr3 = l1.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		sc.close();
	}
}
