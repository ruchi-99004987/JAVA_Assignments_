package com.ltts_activity9;
import java.util.*;
public class Team {
	private String name;
	private LinkedList<String> l1=new LinkedList<String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<String> getL1() {
		return l1;
	}
	public void setL1(LinkedList<String> l1) {
		this.l1 = l1;
	}
	Team(){
		this.name = name;
		this.l1 = l1;
	}
	public Team(String name, LinkedList<String> l1) {
		super();
		this.name = name;
		this.l1 = l1;
	}
	void addPlayer(String playername) {
		l1.add(playername);
	}
	LinkedList<String> getPlayerList() {
		Collections.sort(l1);
		return l1;
	}
}
