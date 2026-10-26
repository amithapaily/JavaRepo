package java_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ForEach_Loop_For_Printing_Elements_In_Collections 
{
	public static void main(String[] args) 
	{
		List<Integer> l= new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		
		for(int n:l) 
		{
			System.out.println(n);
		}
		
	}
}


