package ListIterator.com.dss;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("abcd");
		al.add("efgh");
		al.add("ijkl");
		al.add("mnop");
		
	
		//Listiterator cursor : with normal version : print the data in forward direction
		ListIterator it1 = al.listIterator();
		while(it1.hasNext()){	
			String str = (String)it1.next();
			System.out.println(str);
		}
		
		////Listiterator cursor : with Generics version : print the data in forward direction
		ListIterator <String> it = al.listIterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
		//Listiterator cursor : with Generics version : print the data in backward direction
		while(it.hasPrevious()){	
			String str = it.previous();
			System.out.println(str);
		}
	}
}