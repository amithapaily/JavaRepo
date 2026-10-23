package java_collections;

import java.util.ArrayList;

public class Class_List_NonGneric {

	public static void main(String[] args) {
		
			ArrayList l=new ArrayList();
			l.add(8);
			l.add(5.12);
			l.add("Hello");
			l.add(4);
			System.out.println(l);
			System.out.println(l.get(2));
			l.set(2, 10);
			System.out.println(l);
			System.out.println(l.size());
			System.out.println(l.isEmpty());
			l.remove(3);
			System.out.println(l);
			System.out.println(l.contains(10));
			System.out.println(l.contains(12));
			System.out.println(l.indexOf(10));
			l.add(5);
			System.out.println(l);
			System.out.println(l.lastIndexOf(5));
		}

	}


