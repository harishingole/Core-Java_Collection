package comparator.dss;

import java.util.Comparator;

public class Eid_Comparator implements Comparator{
	
	@Override
	public int compare(Object e1, Object e2) {
		Emp o1 = (Emp)e1;
		Emp o2 = (Emp)e2;
		if(o1.eid == o2.eid)
			return 0;
		else if(o1.eid > o2.eid )
			return 1;
		else 
			return -1;
	}
}
