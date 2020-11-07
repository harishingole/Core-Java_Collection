package Iterator.com.dss;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("abcd");
		al.add("mnop");
		al.add("ijkl");
		al.add("efgh");
		al.add(null);
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.println(str);
	
		}
	}

}
