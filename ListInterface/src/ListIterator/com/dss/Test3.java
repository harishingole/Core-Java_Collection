package ListIterator.com.dss;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Anu");
		al.add("Ratan");
		al.add("Durga");
		
	
		//Listiterator cursor : with normal version : print the data in forward direction
		ListIterator<String> it1 = al.listIterator();
		
		while(it1.hasNext())
		{
			String str = it1.next();
				if(str.equals("Durga"))
					it1.remove();
				if(str.equals("Anu"))
					it1.set("Anushka");
				System.out.println(str);
		}
		//manu adds in the ArrayList whichever iterator is pointing to index
		it1.add("Manu");
		while(it1.hasPrevious())
		{
			String str = it1.previous();
			System.out.println(str);
		}
		while(it1.hasNext())
		{
			String str = it1.next();
			System.out.println(str);
		}
	}

}
