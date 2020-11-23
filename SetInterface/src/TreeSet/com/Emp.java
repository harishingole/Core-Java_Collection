package TreeSet.com;

public class Emp implements Comparable<Emp>{
	
	int eid;
	String name;
	public Emp(){}
	
	public Emp(int id, String name) {
		super();
		this.eid = id;
		this.name = name;
	}
	
	public String printEmp() {
		return "Emp [eid=" + eid +", name=" + name + "]";
		
	}

	@Override
	public int compareTo(Emp e) {
		if(eid == e.eid)
			return 0;
		if(eid > e.eid)
			return 1;
		else
			return -1;
	}	
	
	
}
