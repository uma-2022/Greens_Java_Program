package org.map.prac;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Hashmap {
	public static void main(String[] args) {
	 Map<Float,String> m=new HashMap<Float,String>();
	 m.put(1.7f,"Automation");
	 m.put(0.5f, "Test1");
	 m.put(2.5f, "Uma");
	 m.put(3.4f, null);
	 m.put(5.2f, "Jeevi");
	 m.put(6.8f, "Testing");
	 m.put(null,"Selenium");//can't accepted
	 m.put(null, null);
	 System.out.println(m);
	 
	 int size1 = m.size();
	 System.out.println("Size:"+size1);
	 
     boolean contains1=m.containsKey(null);
     System.out.println(contains1);
	 
     boolean containsValue1 = m.containsValue("jeevi");
     System.out.println(containsValue1);
     
     boolean empty1 = m.isEmpty();
     System.out.println(empty1);
     
    // m.clear();
    // System.out.println(m);
     
     String string1 = m.get(1);
     System.out.println(string1);
     
     Set<Float> keySet1 = m.keySet();
     System.out.println(keySet1);
     
      Collection<String> values1 = m.values();
     System.out.println(values1);
     
     Set<Entry<Float, String>> entrySet1 = m.entrySet();
     System.out.println(entrySet1);
     
	 
	 
		
	}

}
