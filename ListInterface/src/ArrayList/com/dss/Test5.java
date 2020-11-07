package ArrayList.com.dss;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(10.5);
		al.add("Saru");
		al.add(null);
		al.add("Harish");
		al.add("end");
		System.out.println(al);
		//get the size of an arraylist
		System.out.println(al.size());
		//add index randomly in loc
		al.add(2, "Durga");
		System.out.println(al);
		//remove the object from arraylist
		al.remove(3);
		al.remove(null);
		System.out.println(al);
		//replace the object or overrde the object 
		al.set(2, "C-DAC");
		System.out.println(al);
	
		ArrayList al1 = new ArrayList();
		al1.addAll(al);
		System.out.println("al1:: "+al1);
		al1.addAll(0, al);
		System.out.println("add al to 0th index of al1:: "+al1);
		//clear all the data from arraylist
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		
	}

}
