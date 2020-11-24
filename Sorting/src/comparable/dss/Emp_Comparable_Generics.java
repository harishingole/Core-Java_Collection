package comparable.dss;

public class Emp_Comparable_Generics implements Comparable<Emp_Comparable_Generics>{
	
	int eid;
	String name;
	
	public Emp_Comparable_Generics(int id, String name) {
		super();
		this.eid = id;
		this.name = name;
	}

	/*@Override
	public int compareTo(Emp_Comparable_Generics e) {
		
		if(eid == e.eid)
		return 0;
		else if(eid > e.eid)
			return 1;
		else
			return -1;
	}*/
	public int compareTo(Emp_Comparable_Generics ecg) {
		return name.compareTo(ecg.name);
		
	}
}
