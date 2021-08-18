package com.ltts_activity_11;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Bowler [] bobj=new Bowler[5];
		Wicket [] wobj=new Wicket [5];
		String choice;
		int i=0;
		
		Scanner inp=new Scanner(System.in);
		Map maindetail=new HashMap();
		
		do {
		System.out.println("Enter the player name");
		String name=inp.next();
		bobj[i]=new Bowler(name);
		
		inp.nextLine();
		
		System.out.println("Enter wickets - seperated by \",\" symbol.");
		String allwickets=inp.nextLine();
		wobj[i]=new Wicket(allwickets,bobj[i]);
		maindetail.put(name, i);
		
		System.out.println("Do you want to add another player (yes/no)");
		choice=inp.next();
		i++;
		}while(choice.equals("yes"));
		
		do {
		System.out.println("Enter the player name to search");
		String outchoice=inp.next();
		
		
		if(maindetail.containsKey(outchoice)) {
			System.out.println("Player name: "+outchoice);
			System.out.println("Wickets:");
			wobj[(int) maindetail.get(outchoice)].getPlayername();
		}
		else {
			System.out.println("No player found with the name "+outchoice+"\n");
		}
		System.out.println("Do you want to search another player (yes/no)");
		choice=inp.next();
		}while(choice.equals("yes"));
		
	}

}
