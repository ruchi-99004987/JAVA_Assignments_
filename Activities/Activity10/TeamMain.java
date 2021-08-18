package com.ltts_activity10;
import java.util.*;
public class TeamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Team>l1=new ArrayList<Team>();
		Team t=new Team();
		System.out.println("Enter number of teams:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter team "+ i+" detail");
			System.out.println("Enter Name");
			t.setName(sc.next());
			System.out.println("Enter number of matches");
			t.setNumberOfMatches(sc.nextLong());
			String s1=t.getName();
			long lo=t.getNumberOfMatches();
			l1.add(new Team(s1,lo));
		}


		Collections.sort(l1,new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for(Team t1:l1) {
			System.out.println(t1.getName()+"-"+t1.getNumberOfMatches());
		}
	}

}
