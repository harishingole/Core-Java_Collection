package TreeSet.com;

import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		//String class implements comparable Interface
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Harish");
		ts.add("Saru");
		ts.add("Avi");
		ts.add("Manu");
		System.out.println(ts);
		//Wrapper Class also implements Comparable Interface
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(11);
		ts1.add(5);
		ts1.add(3);
		ts1.add(7);
		ts1.add(10);
		System.out.println(ts1);
		
		//Heterogeneous data is not allowed
		TreeSet ts2 = new TreeSet();
		ts2.add("Harish");
		//ts2.add(111);//class cast exception
		TreeSet<String> ts3 = new TreeSet<String>();
		ts3.add("Harish");
		ts3.add(null);//null pointer exception
		
	}

}
