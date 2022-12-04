package org.map1.prac;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHash_Map {
	public static void main(String[] args) {
		Map<Object,String> m=new LinkedHashMap<Object,String>();
		m.put(1, "Java");
		m.put(0, null);
		m.put(3,"Pai"); 
		m.put(4,"Kelvin");
		m.put(8,"Kiwi");
		m.put(3,"Poori");
		m.put(11, null);
		m.put(null, null);
	    System.out.println(m);
	    
	    int size1 = m.size();
	    System.out.println("Size:"+size1);
	    
	    boolean containsKey1 = m.containsKey(8);
	    System.out.println(containsKey1);
	    
	    boolean containsValue = m.containsValue("Poori");
	    System.out.println( containsValue);
	    
	    boolean empty = m.isEmpty();
		System.out.println(empty);
		
		Map<Integer,String> m1=new LinkedHashMap<Integer,String>();
		m1.put(1,"Alpha");
		m1.put(4, null);
		m1.put(3,"Ink");
		m1.put(2,"Beta");
		m1.put(3, null);
		m1.put(2, "Gamma");
		System.out.println(m1);
		m1.clear();
		System.out.println(m1);
		
		String string = m.get(4);
		System.out.println(string);
		
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<Object, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		
	}

}
