package com.ltts_activity_11;
import java.util.*;
public class MainMap {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Map maindetail=new TreeMap();
		ArrayList key=new ArrayList();
		
		System.out.println("Enter the number of players");
		int number=inp.nextInt();
		Player [] pobj=new Player[number];
		for(int i=0;i<number;i++) {
			System.out.println("Enter the details of the player "+(i+1));
			int capnumber=inp.nextInt();
			key.add(capnumber);
			String name=inp.next();
			String team=inp.next();
			String skill=inp.next();
			pobj[i]=new Player(name,team,skill);
			maindetail.put(capnumber,pobj[i]);
		}
		
		System.out.println("Player Details");
		Collections.sort(key);
		for(int i=0;i<number;i++) {
		Player obj2=(Player) maindetail.get(key.get(i));
		System.out.println(key.get(i)+"--"+obj2.getName()+"--"+obj2.getTeam()+"--"+obj2.getSkill());
	}
	}
}
