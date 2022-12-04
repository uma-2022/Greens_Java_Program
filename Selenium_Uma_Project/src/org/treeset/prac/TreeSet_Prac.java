package org.treeset.prac;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Prac {
	public static void main(String[] args) {
		Set<Integer> s1=new TreeSet<Integer>();
		s1.add(90);
		s1.add(89);
		s1.add(78);
		s1.add(67);
		s1.add(56);
		s1.add(45);
		s1.add(34);
		s1.add(23);
		s1.add(21);
		s1.add(11);
		System.out.println(s1);
		
		int size = s1.size();
		System.out.println(size);
		
		boolean contains = s1.contains(56);
		System.out.println(contains);
		
		Set<Integer> s2=new TreeSet<Integer>();
		/*s2.add('%');
		s2.add(67);
		s2.add("Fathima");
		s2.add(null);
		s2.add(23);
		s2.add(67.4);
		s2.add(21);
		System.out.println(s2); Not allowed Heterogeneous */
		
		s2.add(11);
		s2.add(12);
		s2.add(13);
		s2.add(21);
		s2.add(15);
		s2.add(16);
		System.out.println(s2);
		
		//s2.remove(15);
		//System.out.println(s2);
		
		//s2.removeAll(s1);
		//System.out.println(s2);
		
		//s2.retainAll(s1);
		//System.out.println(s2);
		//s2.clear();
		//System.out.println(s2);
		
		s1.addAll(s2);
		System.out.println(s1);
		
		boolean empty = s1.isEmpty();
		System.out.println(empty);
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		Object[] array = s1.toArray();
		for(Object object:array )
		System.out.println(object); 
		System.out.println("Array Size:"+array.length);
		
		String string = s1.toString();
		System.out.println("List of String:"+string);
		System.out.println("String Lengh:"+string.length());
		
		
		
		
		
		
	}

}
