package comparator.dss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		Emp e1 = new Emp(584, "Harish");
		Emp e2 = new Emp(362, "Manu");
		Emp e3 = new Emp(745, "Saru");
		Emp e4 = new Emp(123, "Sandy");
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Collections.sort(al, new Eid_Comparator());
		for(Emp e:al)
		{
			System.out.println(e.eid+" "+e.name);
		}
		System.out.println();
		ArrayList<Emp> a1l = new ArrayList<Emp>();
		Emp e11 = new Emp(584, "Harish");
		Emp e12 = new Emp(362, "Manu");
		Emp e13 = new Emp(745, "Saru");
		Emp e14 = new Emp(123, "Sandy");
		a1l.add(e11);
		a1l.add(e12);
		a1l.add(e13);
		a1l.add(e14);
		
		Collections.sort(a1l, new Ename_Comparator());
		for(Emp e:a1l)
		{
			System.out.println(e.eid+" "+e.name);
		}
		System.out.println();
		LinkedList<Product> l = new LinkedList<>();
		l.add(new Product(563, "MasalaDosa", 55.00));
		l.add(new Product(393, "MixDosa", 55.00));
		l.add(new Product(233, "PlainDosa", 55.00));
		l.add(new Product(123, "SpunchaDosa", 55.00));
		
		Collections.sort(l, new IdComparator());
		for(Product p:l)
		{
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
		
	}
}
