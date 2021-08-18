package com.ltts_activity9;

public class Ranking implements Comparable<Ranking>{
	private String name;
	private long score;
	
	Ranking(){
		this.name=name;
		this.score=score;
	}
	public Ranking(String name, long score) {
		super();
		this.name = name;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getScore() {
		return score;
	}


	public void setScore(long score) {
		this.score = score;
	}


	@Override
	public int compareTo(Ranking r) {
		if(this.score==r.getScore())
		return 0;
		else if(this.score<r.getScore())
			return +1;
		else
			return -1;
	}

}
