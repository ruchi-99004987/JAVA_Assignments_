package com.ltts_activity9;
import java.util.*;
public class DisplayTeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Player p1=new Player();
		Team t1=new Team();
		LinkedList<Team>l2=new LinkedList<Team>();
		LinkedList<String> l3=new LinkedList<String>();
		System.out.println("Enter number of teams:");
		int num = sc.nextInt();
		System.out.println("enter name of team|player name:");
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
			p1.setName(sc.nextLine());
			p1.setName(sc.nextLine());
			String s1=p1.getName();
			l3.add(s1);
			}
			t1.setName(sc.next());
			String s2=t1.getName();
			l2.add(new Team(s2,l3));
		}
		for(Team t:l2) {
			System.out.println(t.getName()+" "+t.getPlayerList());
		}
	}

}
