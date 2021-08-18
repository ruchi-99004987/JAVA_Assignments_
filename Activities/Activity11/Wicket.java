package com.ltts_activity_11;

public class Wicket {
	private String [] playername;
	private Bowler bo;
	
	public void setPlayername(String playername) {
		this.playername = playername.split(",");
	}
	public void getPlayername() {
		for(int j=0;j<this.playername.length;j++) {
			System.out.println(this.playername[j]);
		}	
	}
	
	public void setBo(Bowler bo) {
		this.bo = bo;
	}
	
	Wicket(String allplayers, Bowler object){
		setBo(object);
		setPlayername(allplayers);
	}
}
