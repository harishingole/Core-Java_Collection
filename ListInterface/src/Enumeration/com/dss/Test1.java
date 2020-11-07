package Enumeration.com.dss;

import java.util.Enumeration;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v.toString());
		
		//to get the Enumeration object we need to call elements() method
		Enumeration e = v.elements();
		//to check the data is available or not 
		while(e.hasMoreElements())
		{
			//nextElement return type is object class we must typecast with Integer bez. Enumeration is not generics
			Integer i = (Integer)e.nextElement();
			System.out.println(i);
		}
		//to get the Generic Enumeration<> object we need to call elements() method
		Enumeration<Integer> e1 = v.elements();
		while(e1.hasMoreElements())
		{
			Integer i = e1.nextElement();
			
			System.out.println(i);
		}
		
	}

}
