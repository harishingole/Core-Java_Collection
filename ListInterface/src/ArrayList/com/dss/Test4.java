package ArrayList.com.dss;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		//Arrays are type safe
		int []a= {10,20,30};
		for(int aa:a)
		{
			System.out.println(aa);
		}
		
		//Collections are not type safe so reading the data and printing the data are problem
		ArrayList al = new ArrayList();
		al.add(new Emp(111,"Harish"));//bulb symbol is popup so its not recommended 
		al.add(new Student(121,"Vaibhav"));
		
		for(Object o:al)
		{
			if(o instanceof Emp)
			{
				Emp e = (Emp)o;
				System.out.println(e.eid + e.name);
			}
			if(o instanceof Student)
			{
				Student s = (Student)o;
				System.out.println(s.sid + s.name);
			}
		}
		
		//so to overcome this problem java provides generic concept 
		//Generic provide the type safety to collection
		
		ArrayList<Emp> al1 = new ArrayList<Emp>();
		al1.add(new Emp(100,"harry"));
		al1.add(new Emp(200,"abc"));
		
		for(Emp e :al1)
		{
			System.out.println(e.eid+e.name);
		}
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student(1111, "xyz"));
		al2.add(new Student(2222,"abc"));
		for(Student s :al2)
		{
			System.out.println(s.sid+s.name);
		}
	}

}
