package ListIterator.com.dss;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Harish");
		al.add("Vaibhav");
		al.add("Sumedh");
		al.add("Ravi");
		
	
		ListIterator <String> it = al.listIterator();
		//Listiterator cursor : with Generics version : remove the data 
		while(it.hasNext())
		{
			String s = it.next();
			if(s.equals("Sumedh"))
				it.remove();
		}
		System.out.println(al);
	}

}
