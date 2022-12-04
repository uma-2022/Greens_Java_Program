package org.map1.prac;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Table {
	public static void main(String[] args) {
		Map<Integer,String> m=new Hashtable<Integer,String>();
		m.put(1, "Anson");
		m.put(2, "Geetha");
		m.put(3, "Seetha");
		m.put(4, "keen");
		
		Hashtable<Integer, String> m2=new Hashtable<Integer, String>();
		m2.put(5, "Jeyam");
		m2.put(6, "Leela");
		m2.put(7, "Baby");
		System.out.println("Mappings of m1: " + m);
		System.out.println("Mappings of m2: " + m2);
		
		int size1 = m.size();
		System.out.println("Size:"+size1);
		
		boolean containsKey = m.containsKey(3);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("keen");
		System.out.println(containsValue);
		
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
		m2.clear();
		
		String string = m.get(3);
		System.out.println(string);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);		
			  
	}

}
