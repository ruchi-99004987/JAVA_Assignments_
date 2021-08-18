package com.ltts_activity9;
import java.util.*;
public class MatchSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Match> a1=new LinkedList<Match>();
		Match obj=new Match();
		System.out.println("Enter the number of matches:");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
		System.out.println("Enter  match date in (MM-dd-yyyy)");
		obj.setMatchDate(sc.next());
		System.out.println("Enter Team 1");
		obj.setTeamOne(sc.next());
		System.out.println("Enter Team 2");
		obj.setTeamTwo(sc.next());
		String s1=obj.getMatchDate();
		String s2=obj.getTeamOne();
		String s3=obj.getTeamTwo();
		a1.add(new Match(s1,s2,s3));
		}
		Collections.sort(a1);
		for(Match m : a1){    
			System.out.println("Match date:"+m.getMatchDate()+"\nTeam 1:"+m.getTeamOne()
			+"\nTeam 2:"+m.getTeamTwo());    
			} 
	}
}
