package ArrayList.com.dss;

import java.util.ArrayList;
import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {
		//conversion from arrays to collection and vice versa
		String [] str = {"aaa","bbb","ccc"};
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(str));
		a1.add("ddd");
		a1.add("eee");
		System.out.println(a1);
		
		//generic Collection to arrays
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("xxx");
		a2.add("yyy");
		a2.add("zzz");
		
		String[] s1= new String[a2.size()];
		a2.toArray(s1);
		System.out.println(a2);
		
		//non-generic collection to arrays
		ArrayList a3 = new ArrayList();
		a3.add("p");
		a3.add(10);
		a3.add(12.2);
		
		Object[] o = a3.toArray();
		for(Object oo:o)
		{
			System.out.println(oo);
		}
		}

}
