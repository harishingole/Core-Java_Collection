package LinkedHashSet.com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test2 {

	public static void main(String[] args) {
		
		//Insertion order is preserved
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Hary");
		lhs.add("Manu");
		HashSet<String> hs = new HashSet<String>(lhs);
		hs.add("Saru");
		System.out.println(hs);
		
		HashSet<String> hs2 = new HashSet<String>(hs);
		hs2.add("Guddu");
		
		HashSet<String> hs3 = new HashSet<String>(hs2);
		hs3.add("Pratu");
		
		HashSet<String> hs4 = new HashSet<String>();
		hs4.addAll(hs3);
		System.out.println(hs4);
		
		}

}
