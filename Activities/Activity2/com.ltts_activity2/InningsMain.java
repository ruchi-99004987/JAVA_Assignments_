package Activity_2;
import java.util.*;
public class InningsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Innings inng = new Innings();
		System.out.println("Enter the team name:");
		inng.setTeamname(sc.next());
		System.out.println("Enter session:");
		inng.setInningsname(sc.next());
		System.out.println("Enter runs:");
		inng.setRuns(sc.nextInt());
		inng.displayInningsDetails();
		sc.close();
	}

}
