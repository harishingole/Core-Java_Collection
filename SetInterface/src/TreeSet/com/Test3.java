package TreeSet.com;

import java.util.Comparator;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		//String class implements comparable Interface
		TreeSet<String> ts = new TreeSet<String>(new MyComp());
		ts.add("Harish");
		ts.add("Saru");
		ts.add("Avi");
		ts.add("Manu");
		System.out.println(ts);
		
	}
}
