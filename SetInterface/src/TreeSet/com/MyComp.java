package TreeSet.com;

import java.util.Comparator;

public class MyComp implements Comparator<String>{

	/*Ascending order
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}*/
	//Desc order
	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
	
}


