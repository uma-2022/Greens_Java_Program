package org.linkedhashset.prac;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;


public class Linked_HashSet {
	public static void main(String[] args) {
		
    Set<Object> s=new LinkedHashSet<Object>();
	s.add(3);
	s.add(null);
	s.add(90);
	s.add("Steam");
	s.add("Work");
	s.add(56);
	s.add(6);
	s.add('F');
	s.add(23.5);
	s.add('$');
	System.out.println(s);
	
	int size1 = s.size();
	System.out.println(size1);
	
	boolean contains1 = s.contains("Work");
	System.out.println(contains1); 
	
	s.remove(null);
	System.out.println(s);
	
	Set<Integer> s1=new LinkedHashSet<Integer>();
	s1.add(67);
	s1.add(68);
	s1.add(56);
	s1.add(70);
	s1.add(91);
	s1.add(41);
	s1.add(65);
	System.out.println(s1);
	
	//s.removeAll(s1);
	//System.out.println(s);
	
	//s.retainAll(s1);
	//System.out.println(s);
	
	//s.clear();
	//System.out.println(s);
	
	s.addAll(s1);
	System.out.println(s);
	
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	boolean equals = s.equals(s1);
	System.out.println(equals);
	
	Object[] array = s.toArray();
	for(Object object:array )
	{
		System.out.println(object);
	}
	int size=array.length;
	System.out.println(size);
	
	
	String string = s.toString();
	System.out.println(string);
	
	System.out.println(string.length());
	
	
	
	
	
	
		
	}
	
	
	

}
