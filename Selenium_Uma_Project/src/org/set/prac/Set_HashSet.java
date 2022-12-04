package org.set.prac;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Set_HashSet {
	public static void main(String[] args) {
		Set<Object> s=new HashSet<Object>();
		s.add(25);
		s.add("Hai");
		s.add(null);
		s.add(28);
		s.add(29);
		s.add(30);
		s.add(45);
		s.add(90);
		s.add("world");
		s.add("Happy");
		System.out.println(s);
		
		//s.add(4,"Kamali");//Doesn't work
		
		int size1 = s.size();
		System.out.println(size1);
		
		boolean contains1 = s.contains(45);
		System.out.println(contains1);
		
		s.remove("world");
		System.out.println(s);
		
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(11);
		s1.add(21);
		s1.add(30);
		s1.add(41);
		s1.add(90);
		System.out.println(s1);
		
		//s.removeAll(s1);
		//System.out.println(s);
		//System.out.println(s1);
		
		//s.retainAll(s1);
		//System.out.println(s);
		
		//s1.clear();
		//System.out.println(s1);
		
		s.addAll(s1);
		System.out.println(s);
		
		boolean empty1 = s.isEmpty();
		System.out.println(empty1);
		
		boolean equals1 = s.equals(s1);
		System.out.println(equals1);
		
		Object[] array = s.toArray();
		for(Object object:array)
		System.out.println(object);
		
		int length1=array.length;
		System.out.println("length="+length1);
		
		String string1 = s.toString();
		System.out.println(string1);
		
		int length2 = string1.length();
		System.out.println("Length="+length2);
		
		
	}
	
	
	
	
	
	
	
	

}
