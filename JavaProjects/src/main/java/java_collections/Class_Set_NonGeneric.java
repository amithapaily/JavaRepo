package java_collections;

import java.util.HashSet;
import java.util.Set;

public class Class_Set_NonGeneric {

	public static void main(String[] args) {
		Set s=new HashSet();
		Set t=new HashSet();
		
		s.add(10);
		s.add(20.88);
		s.add(30);
		s.add("Hello");
		System.out.println(s);
		
		t.add(5);
		t.add(15);
		t.add("Hi");
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
