package org.vector.prac;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class List_Vector {
	public static void main(String[] args) {
		List<Object> l = new Vector<Object>();
		l.add(11);
		l.add(12);
		l.add(13);
		l.add("Welcome");
		l.add("Testing");
		l.add(14);
		l.add(15);
		System.out.println(l);

		l.add(4, 15);
		l.add(1, '#');
		System.out.println("List1:" + l);

		int size = l.size();
		System.out.println("Size:" + size);

		int indexOf = l.indexOf(15);
		System.out.println(indexOf);

		int lastIndexOf = l.lastIndexOf(15);
		System.out.println(lastIndexOf);

		boolean contains = l.contains("Welcome");
		System.out.println(contains);

		Object object = l.get(3);
		System.out.println(object);

		// Object object2 = l.get(12);
		// System.out.println(object2);

		l.set(3, 78);
		System.out.println(l);

		l.remove(4);
		System.out.println(l);

		List<Integer> l2 = new Vector<Integer>();
		l2.add(15);
		l2.add(12);
		l2.add(16);
		l2.add(14);
		l2.add(11);
		System.out.println("List2:" + l2);

		// l.removeAll(l2);
		// System.out.println(l);

		// l.retainAll(l2);
		// System.out.println(l);

		// l2.clear();
		// System.out.println(l2);
		
		l.addAll(l2);
		System.out.println(l);
		
		boolean empty = l.isEmpty();
		System.out.println(empty);
		
		boolean equals = l.equals(l2);
		System.out.println(equals);
		
		Collections.sort(l2);
		System.out.println(l2);
		
		Object[] array = l.toArray();
		for(Object obj : array)
		{
			System.out.println(obj);
		}
		System.out.println("Length:"+array.length);
		
		String string = l.toString();
		System.out.println(l);
		System.out.println("Length:"+string.length());
		}
		
		

	}


