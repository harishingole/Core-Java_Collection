package LinkedList.com.dss;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(0, "Harish");
		ll.add(1, "Vicky");
		ll.add(2, "Yuvraj");
		ll.add(3, "Manish");
		ll.add(4, "Sandip");
		System.out.println(ll);
		ListIterator<String> itr = ll.listIterator();
		while(itr.hasNext()){	
			String str = itr.next();
			System.out.println(str);
		}
		
		ll.addFirst("Ingole");
		ll.addLast("C-DAC");
		ll.set(5, "Doma");
		System.out.println(ll);
		System.out.println(ll.size());
		
	}
}
