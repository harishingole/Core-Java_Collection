package TreeSet.com;

import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		//String class implements comparable Interface
		TreeSet<Emp> ts = new TreeSet<Emp>();
		ts.add(new Emp(10, "Saru"));
		ts.add(new Emp(53, "Manu"));
		ts.add(new Emp(5, "Harish"));
		for(Emp e:ts)
		{
			System.out.println(e.eid+ " "+e.name);
		}
	}

}
