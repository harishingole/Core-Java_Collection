package Stack.com.dss;

import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		//push element into stack
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.toString());
		System.out.println(s.peek());
		
		//pop the element
		s.pop();
		System.out.println(s.toString());
		
		//peek method check top of the stack
		System.out.println(s.peek());
		
		//empty method returns true if data is present else false
		System.out.println(s.empty());
		
		//search method is return the index value of data
		System.out.println(s.search(10));
	}
}
