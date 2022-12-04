package org.collection_arraylist.prac;

import java.util.ArrayList;
import java.util.List;

public class Collection_ArrayList {
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(15);
		l1.add(30);
		System.out.println("Integer Datatpe");
		System.out.println("---------------");
		System.out.println("Before Insertion");
		System.out.println(l1);
		l1.add(2,20);
		System.out.println("After Insertion");
		System.out.println(l1);
		
		int size1 = l1.size();
		System.out.println("List Size:"+size1);
		
		List<String> l2 = new ArrayList<String>();
		l2.add("Anitha");
		l2.add("Banu");
		l2.add("Chitra");
		l2.add(null);
		System.out.println("String Datatype"); 
		System.out.println("---------------");
		System.out.println("Before Insertion");
		System.out.println(l2);
		System.out.println("After Insertion");
		l2.add(2,"Celina");
		System.out.println(l2);
		
		int size2 = l2.size();
		System.out.println("List Size:"+size2);
		
		List<Character> l3 = new ArrayList<Character>();
		l3.add('c');
		l3.add('A');
		l3.add('@');
		l3.add('#');
		System.out.println("Character Datatype"); 
		System.out.println("---------------");
		System.out.println("Before Insertion");
		System.out.println(l3);
		l3.add(3,'$');
		System.out.println("After Insertion");
		System.out.println(l3); 
		
		System.out.println("All DataTypes");
		System.out.println("-------------");
		List<Object> l4 = new ArrayList<Object>();
		l4.add(40.5f);//float
		l4.add(3546.908);//double
		l4.add(true);//boolean
		l4.add(3566659);//long
		l4.add(-121);//Byte
		l4.add(7845);//Short
		System.out.println("Before Insertion");
		System.out.println(l4);
		l4.add(3,78964);
		System.out.println("After Insertion");
		System.out.println(l4);
		
	}

}

