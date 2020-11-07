package ListIterator.com.dss;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Book> al= new ArrayList<Book>();
		al.add(new Book(111,"DataStructure","Harish Ingole"));
		al.add(new Book(222,"Algorithm","Harish Ingole"));
		al.add(new Book(333,"C-Programming","Harish Ingole"));
		
	
		ListIterator <Book> it = al.listIterator();
		//Listiterator cursor : with Generics version : remove the data by iterator
		while(it.hasNext())
		{
			Book b = it.next();
			if(b.getId()==111)
				it.remove();
			if(b.getName()=="Algorithm")
				it.remove();
		}
		for(Book b:al)
		{	
			System.out.println(b.toString());
		}
	}

}
