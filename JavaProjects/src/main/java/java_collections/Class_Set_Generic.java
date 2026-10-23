package java_collections;

import java.util.HashSet;
import java.util.Set;

public class Class_Set_Generic 
{

	public static void main(String[] args) 
	{
		Set<Integer> s=new HashSet<Integer>();
		Set<Integer> t=new HashSet<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println(s);
		
		t.add(5);
		t.add(15);
		t.add(25);
		t.add(35);
		System.out.println(t);
		
		s.addAll(t);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains(25));
		System.out.println(s.contains(28));
		System.out.println(s.containsAll(t));
		System.out.println(t.containsAll(s));
		System.out.println(s.remove(5));
		System.out.println(s);
		System.out.println(s.removeAll(t));
		System.out.println(s);
		t.clear();
		System.out.println(t);
	}

}
