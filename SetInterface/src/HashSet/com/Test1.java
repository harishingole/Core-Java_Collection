package HashSet.com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test1 {

	public static void main(String[] args) {
		
		//Insertion order is not preserved
		HashSet<String> hs = new HashSet<String>();
		hs.add("Saru");
		hs.add("Harish");
		hs.add("Manu");
		hs.add("Sandy");
		hs.add("Guddu");
		hs.add("Guddu");
		System.out.println(hs);
		
		//to check duplicate is ignored or not
		HashSet<String> hs1 = new HashSet<String>();
		System.out.println(hs1.add("harish"));// true
		System.out.println(hs1.add("harish"));//false bez duplicate is ignored
		
		//Insertion order is preserved
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Saru");
		lhs.add("Harish");
		lhs.add("Manu");
		lhs.add("Sandy");
		lhs.add("Guddu");
		lhs.add("Guddu");
		System.out.println(lhs);

	}

}
