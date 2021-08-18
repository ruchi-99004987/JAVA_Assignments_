package com.ltts_activity10;
import java.util.*;

import com.ltts_activity9.Match;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<Player>l1=new ArrayList<Player>();
		Player play=new Player();
		System.out.println("Please provide the number of players to be registered:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
		System.out.println("Please enter player name:");
		play.setName(sc.nextLine());
		play.setName(sc.nextLine());
		String s1=play.getName();
		System.out.println("Please select the skill of the player\r\n"
				+ "1.All Rounder\r\n"
				+ "2.Batsman\r\n"
				+ "3.Bowler\r\n");
		play.setSkill(sc.next());
		String s2=play.getSkill();
		String s3=play.skillset(s2);
		l1.add(new Player(s1,s3));
		}

		Collections.sort(l1,new PlayerComparator());
		Collections.sort(l1,new PlayerSkillComparator());
		for(Player p: l1){    
			System.out.println("Player: "+p.getName()+" "+p.skillset(p.getSkill()));   
			} 
	}

}
