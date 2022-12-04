package org.linked.prac;

import java.util.*;

public class Llist {
	public static void main(String[] args) {
	    List<Integer> a1 = new LinkedList<Integer>();
		a1.add(10);
		a1.add(11);
		a1.add(18);
		a1.add(13);
		a1.add(null);
		a1.add(28);
		System.out.println(a1);

		a1.add(3, 12);
		System.out.println(a1);
		a1.add(11);
		System.out.println(a1);

		int size1 = a1.size();
		System.out.println("Size:" + size1);

		int indexOf1 = a1.indexOf(11);
		System.out.println(indexOf1);

		int lastIndexOf1 = a1.lastIndexOf(11);
		System.out.println(lastIndexOf1);

		boolean contains1 = a1.contains(null);
		System.out.println(contains1);

		Integer integer1 = a1.get(6);
		System.out.println(integer1);
		// Integer integer2 = a1.get(10);
		// System.out.println(integer1);

		a1.set(4, 15);
		System.out.println(a1);

		a1.remove(2);
		System.out.println(a1);
		LinkedList l1 = new LinkedList<Integer>();
		l1.add(21);
		l1.add(90);
		l1.add(28);
		l1.add(38);
		System.out.println("List2:" + l1);

		//a1.removeAll(l1);
		//System.out.println("List2:" + l1);
		//System.out.println("List1:"+a1);
		//System.out.println("List2:" + l1);
		
		boolean retainAll1 = a1.retainAll(l1);
		System.out.println(retainAll1);
		System.out.println("List1:"+a1);
		
		//l1.clear();
		//System.out.println("List:"+l1);
		
	     a1.addAll(l1);
	     System.out.println("addall"+a1);
	     
	     boolean empty = l1.isEmpty();
	     System.out.println(empty);
	     
	     boolean equals = a1.equals(l1);
	     System.out.println(equals);
	     
	     Collections.sort(l1);
	     System.out.println(l1);
	     
	     Object[] arr =l1.toArray();
	     for (Object object1 : arr) {
	    	 System.out.println(object1);
	    	 
	    String string=a1.toString();
	    System.out.println(string);
			
		}
	     
		
		
		
		

	}

}
