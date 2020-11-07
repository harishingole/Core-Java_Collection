package ArrayList.com.dss;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Emp e1 = new Emp(1,"Harish");
		Emp e2 = new Emp(2,"Sarika");
		Student s1 = new Student(11,"Vaibhav");
		Student s2 = new Student(12, "Manish");
		al.add(e1);
		al.add(e2);
		al.add(10);
		al.add(null);
		al.add(s1);
		al.add(s2);
		//System.out.println(al.toString());
		for(Object o :al)
		{
			if(o instanceof Emp)
			{
				Emp e = (Emp)o;
				System.out.println("Emp-Id :: " + e.eid + " Emp-Name :: " + e.name);
			}
			if(o instanceof Student)
			{
				Student s = (Student)o;
				System.out.println("Student-Id :: " + s.sid + " Sudent-name :: " + s.name);
			}
			if(o instanceof Integer)
			{
				System.out.println(o);
			}
			if(o instanceof String)
			{
				System.out.println(o);
			}
		}
	}

}
