package com.ltts_activity9;

public class Match implements Comparable<Match>{
	String matchDate;
	String teamOne;
	String teamTwo;
	@Override
	public int compareTo(Match m) {
		// TODO Auto-generated method stub
		if(this.matchDate.compareTo(m.getMatchDate())==0)
		return 0;
		else if(this.matchDate.compareTo(m.getMatchDate())>0)
			return +1;
		else
			return -1;
	}
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	Match(){
		this.matchDate=matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public Match(String matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	
}
