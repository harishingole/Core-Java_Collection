package TreeSet.com;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		//String class implements comparable Interface
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 1; i < 10; i++) {
			ts.add(i);
		}
		System.out.println(ts);
		SortedSet<Integer> ss = ts.subSet(3,8);
		TreeSet<Integer> ts1 = new TreeSet<Integer>(ss);
		System.out.println(ts1);
		
		SortedSet<Integer> ss1 = ts.tailSet(4);
		TreeSet<Integer> ts2 = new TreeSet<Integer>(ss1);
		System.out.println(ts2);
		SortedSet<Integer> ss2 = ts.headSet(5);
		TreeSet<Integer> ts3 = new TreeSet<Integer>(ss2);
		System.out.println(ts3);
	}
}
