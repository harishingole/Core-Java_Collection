package comparable.dss;

import java.util.ArrayList;
import java.util.Collections;

import comparator.dss.Product;

public class Test {

	public static void main(String[] args) {
		ArrayList<Emp_Comparable> al = new ArrayList<Emp_Comparable>();
		Emp_Comparable ec1 = new Emp_Comparable(584, "Harish");
		Emp_Comparable ec2 = new Emp_Comparable(362, "Manu");
		Emp_Comparable ec3 = new Emp_Comparable(745, "Saru");
		Emp_Comparable ec4 = new Emp_Comparable(123, "Sandy");
		al.add(ec1);
		al.add(ec2);
		al.add(ec3);
		al.add(ec4);
		
		Collections.sort(al);
		for(Emp_Comparable e:al)
		{
			System.out.println(e.eid + " " +e.name);
		}
		
		ArrayList<Emp_Comparable_Generics> al1 = new ArrayList<Emp_Comparable_Generics>();
		Emp_Comparable_Generics ecg1 = new Emp_Comparable_Generics(584, "abc");
		Emp_Comparable_Generics ecg2 = new Emp_Comparable_Generics(362, "zxc");
		Emp_Comparable_Generics ecg3 = new Emp_Comparable_Generics(745, "ccc");
		Emp_Comparable_Generics ecg4 = new Emp_Comparable_Generics(123, "adfsa");
		al1.add(ecg1);
		al1.add(ecg2);
		al1.add(ecg3);
		al1.add(ecg4);
		
		Collections.sort(al1);
		for(Emp_Comparable_Generics e : al1)
			System.out.println(e.eid + " " +e.name);
		
		
	}
}
