package HashSet.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		s.add("Manu");
		s.add("Saru");
		System.out.println(s);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		al.add("aaa");
		al.add("aaa");
		System.out.println(al);
		
		//Remove duplicates
		s.addAll(al);
		System.out.println(s);
	}

}
