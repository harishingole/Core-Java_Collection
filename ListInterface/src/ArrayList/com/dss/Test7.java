package ArrayList.com.dss;

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1,"Ratan");
		Emp e2 = new Emp(2,"Harish");
		Emp e3 = new Emp(3,"Vaibhav");
		Emp e4 = new Emp(4,"Ravi");
		
		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);
		
		/*
		 * System.out.println(a2.contains(e1)); System.out.println(a2.containsAll(a1));
		 * a2.remove(e1); System.out.println(a2.contains(e1));
		 * System.out.println(a2.containsAll(a1));
		 */
		
		//a2.removeAll(a1);
		a2.retainAll(a1);
		for(Emp e : a2)
		{
			System.out.println(e.eid+ " "+e.name);
		}

	}

}
