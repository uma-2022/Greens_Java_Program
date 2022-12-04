package Array_Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Methods {
	public static void main(String[] args) {
		List<Object> l1 = new ArrayList<Object>();
		l1.add(12);
		l1.add(14);
		l1.add(15);
		l1.add("Testing");
		l1.add('*');
		l1.add(14);
		l1.add("Kalam");
		l1.add('$');
		l1.add(16);
		l1.add(null);
		System.out.println(l1);
		l1.add(3, "Java");
		System.out.println("List1=  "+l1);

		int size1 = l1.size();
		System.out.println("size=" + size1);

		int indexOf1 = l1.indexOf(14);
		System.out.println(indexOf1);

		int lastIndexOf1 = l1.lastIndexOf(14);
		System.out.println(lastIndexOf1);

		boolean contains1 = l1.contains("Kalam");
		System.out.println(contains1);

		Object o1 = l1.get(4);
		System.out.println(o1);

		// Object o2 = l1.get(11);
		// System.out.println(o2);

		l1.set(3, 17);
		System.out.println(l1);

		l1.remove(10);
		System.out.println(l1);

		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(21);
		l2.add(17);
		l2.add(16);
		l2.add(24);
		l2.add(15);
		System.out.println("List2:  "+l2);
		
		 l1.removeAll(l2);
		 System.out.println(l1);

		//l1.retainAll(l2);
		//System.out.println(l1);

		//l2.clear();
		//System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println(l1); 
		
		boolean empty1 = l1.isEmpty();
		System.out.println(empty1);
		
		boolean equals1 = l1.equals(l2);
		System.out.println(equals1);
		
		System.out.println("Before sort:"+l2);
		Collections.sort(l2);
		System.out.println("After Sort:"+l2);
		
		Object[] arr=l1.toArray();
		for (Object object : arr) {
			System.out.println(object);
		}
		
		String string = l1.toString();
		 System.out.println("Elements of ArrayList: "+string );         
                 

	}

}
