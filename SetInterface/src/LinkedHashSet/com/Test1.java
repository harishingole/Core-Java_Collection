package LinkedHashSet.com;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test1 {

	public static void main(String[] args) {
		
		//Insertion order is preserved
		LinkedHashSet<Emp> lhs = new LinkedHashSet<Emp>();
		lhs.add(new Emp(111,"Manish"));
		lhs.add(new Emp(222, "Sarika"));
		lhs.add(new Emp(333, "Harish"));
		
		for(Emp e :lhs)
		{
			System.out.println(e.printEmp());
		}
		
		Iterator<Emp> itr = lhs.iterator();
		while(itr.hasNext())
		{
			Emp e = itr.next();
			System.out.println(e.eid+" "+e.name);
			if(e.eid == 111)
				itr.remove();
		}
		for(Emp e :lhs)
		{
			System.out.println(e.printEmp());
		}
	}

}
