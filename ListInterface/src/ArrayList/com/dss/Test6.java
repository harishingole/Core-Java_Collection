package ArrayList.com.dss;

import java.util.ArrayList;

public class Test6 {

	/*ArrayListConstructors
	 * 	public java.util.ArrayList(int);
		public java.util.ArrayList();
		public java.util.ArrayList(java.util.Collection<? extends E>);
	 */
	static public void main(String... s)
	{
		//default cons
		//capacity = 10;
		//new capacity = old cap *3/2+1;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(100);
		a2.add(200);
		System.out.println(a2);
		a2.addAll(a1);
		System.out.println(a2);
		System.out.println(a2.contains(10));
		System.out.println(a2.containsAll(a1));
		System.out.println(a1.containsAll(a2));
		
		
	}
}
