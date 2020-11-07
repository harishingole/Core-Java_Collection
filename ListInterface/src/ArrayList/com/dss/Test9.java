package ArrayList.com.dss;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Harish");
		a1.add("Saru");
		a1.add("Manu");
		a1.add("Vicky");
		a1.add("1234");
		System.out.println("Before Swapping :: "+a1);
		//to swap the data; swap method present in Collections class
		Collections.swap(a1, 1, 3);
		System.out.println("After Swapping :: "+a1);
		
		ArrayList<String> a2 = new ArrayList<String>(a1.subList(1, 3));
		
		
		
		System.out.println("Sublist of a1 :: "+a2);
		
	}

}
