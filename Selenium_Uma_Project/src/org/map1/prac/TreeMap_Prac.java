package org.map1.prac;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Prac {
	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap<Integer,String>();
		m.put(9,"Apple");
		m.put(5,"Beta");
		m.put(3,"Pallava");
		m.put(9,null);
		m.put(6,"Hash");
		m.put(2, null);
		m.put(5,"Alpha");
	  //m.put(null, null);
		System.out.println(m);
		
		int size = m.size();
		System.out.println("Size:"+size);
		
		boolean containsKey = m.containsKey(6);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(null);
		System.out.println(containsValue);
		
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
		Map<Integer,String> m1=new TreeMap<Integer,String>();
		m1.put(11,"Abirami");
		m1.put(12,"Deepa");
		m1.put(21,"Geetha");
		m1.put(33, "Fathima");
		System.out.println(m1);
		
		m1.clear();
		System.out.println(m1);
		
		String string = m.get(5);
		System.out.println(string);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
	
			
	}
	

}
