package ArrayList.com.dss;

import java.util.ArrayList;
import java.util.Queue;

public class Test1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//before 1.5 
		al.add(Integer.valueOf(10));
		al.add(Double.valueOf(10.5));
		al.add(Integer.valueOf(10));
		al.add(Character.valueOf('a'));
		
		//Autoboxing int to Integer  introduce in 1.5v
		al.add(10);
		al.add(10.5);
		al.add("Saru");
		al.add(null);
		al.add("Harish");
		al.add(10);
		System.out.println(al);
		System.out.println(al.toString());
		
		
		
		

	}

}
