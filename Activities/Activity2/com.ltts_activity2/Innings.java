package Activity_2;
//Q_2
public class Innings {
	private String teamname;
	private String inningsname;
	private int runs;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public void displayInningsDetails() {
		if (inningsname.equalsIgnoreCase("first") && runs == 200) {
			System.out.println("Name:"+teamname+"\nScored:"+runs+"\nNeed 201 to win");
		}
		else if (inningsname.equalsIgnoreCase("second") && runs == 200) {
			System.out.println("Name:"+teamname+"\nScored:"+runs+"\nMatch Ended");
		}
		else
			System.out.println("Name:"+teamname+"\nScored:"+runs);
	}
}
