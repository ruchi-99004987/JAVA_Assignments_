package com.ltts_activity10;

public class Player {
	String name;
	String skill;
	public String skillset(String str) {
		if(str.equals("1"))
			return "All Rounder";
		else if(str.equals("2"))
			return "Batsman";
		else if (str.equals("3"))
		return "Bowler";
		else
			return str;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
			return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	Player(){
		this.name = name;
		this.skill = skill;
	}
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	
}
