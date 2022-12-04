package org.map1.prac;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.map.prac.Map_Hashmap;

public class ConcurrentHash_Map {
	public static void main(String[] args) {

		Map<Integer, String> mymap= new ConcurrentHashMap<Integer, String>();
		mymap.put(15, "AAA");
		mymap.put(25, "BBB");
		mymap.put(35, "CCC");
		mymap.put(85, "DDD");
		mymap.put(105, "EEE");
		System.out.println(" Mappings are: " + mymap);

		int size = mymap.size();
		System.out.println("Size:" + size);

		boolean containsKey = mymap.containsKey(25);
		System.out.println(containsKey);

		boolean containsValue = mymap.containsValue("DD");
		System.out.println(containsValue);

		boolean empty = mymap.isEmpty();
		System.out.println(empty);

		String string = mymap.get(3);
		System.out.println(string);

		Map<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put(4, "Four");
		System.out.println(m);

		// mymap.clear();
		// System.out.println(mymap);

		Set<Integer> keySet = mymap.keySet();
		System.out.println(keySet);

		Collection<String> values = mymap.values();
		System.out.println(values);

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);

	}

}
