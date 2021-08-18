package com.ltts_activity10;

import java.util.Comparator;

public class TeamComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Team t1=(Team)o1;
		Team t2=(Team)o2;
		
		if(t1.getNumberOfMatches()==t2.getNumberOfMatches())
			return 0;
		else if(t1.getNumberOfMatches()>t2.getNumberOfMatches())
				return +1;
		else
			return -1;
	}
}