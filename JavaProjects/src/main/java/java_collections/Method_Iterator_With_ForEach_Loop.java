package java_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Method_Iterator_With_ForEach_Loop 
{
	public static void main(String[] args) 
	{
		List<Integer> l= new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		
		Iterator<Integer> i=l.iterator();
		for(int n:l) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(l);
	}
}


