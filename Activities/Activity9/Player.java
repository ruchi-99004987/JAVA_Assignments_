package com.ltts_activity9;

public class Player implements Comparable<Player> {
	private String name;

	@Override
	public int compareTo(Player p) {
		// TODO Auto-generated method stub
		if(this.name.compareTo(p.getName())==0)
		return 0;
		else if(this.name.compareTo(p.getName())>0)
			return +1;
		else 
			return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Player(){
		this.name=name;
	}
	public Player(String name) {
		super();
		this.name = name;
	}
	
}
