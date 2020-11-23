package LinkedHashSet.com;

public class Emp {
	
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
	
	
}
