package comparable.dss;

public class Emp_Comparable implements Comparable{
	
	int eid;
	String name;
	
	public Emp_Comparable(int id, String name) {
		super();
		this.eid = id;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Emp_Comparable e  =(Emp_Comparable)o;
		if(eid == e.eid)
		return 0;
		else if(eid > e.eid)
			return 1;
		else
			return -1;
	}
}
