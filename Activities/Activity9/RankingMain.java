package com.ltts_activity9;
import java.util.*;
public class RankingMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Ranking obj=new Ranking();
		ArrayList<Ranking> a1=new ArrayList <Ranking>();
		System.out.println("Please provide the number of  players:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the name of the player"+i);
			obj.setName(sc.next());
			System.out.println("Enter the score of the player"+i);
			obj.setScore(sc.nextLong());
			String s1=obj.getName();
			Long l1=obj.getScore();
			a1.add(new Ranking(s1,l1));
		}
		Collections.sort(a1);  
		for(Ranking r:a1){    
		System.out.println(r.getName()+" "+r.getScore());    
		} 
	}

}
