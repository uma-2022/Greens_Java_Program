package org.wrapper.prac;

import java.util.*;

public class Wrapper {
	public static void main(String[] args) {

		//Data type to object
		System.out.println("Data type to Objects using Wrapper Class");
		System.out.println("-----------------------------------------------");
		short a = 28;
		Short a1 = new Short(a);
		System.out.println("Short="+a1);

		float b = 467.9f;
		Float b1 = new Float(b);
		System.out.println("Float="+b1);

		double c = 789990.789;
		Double c1 = new Double(c);
		System.out.println("Double="+c1);
		
		long f=345567687;
		Long f1=new Long(f);
		System.out.println("Long="+f1);

		char d = 'F';
		Character d1 = new Character(d);
		System.out.println("Character="+d1);

		boolean e = true;
		Boolean e1 = new Boolean(e);
		System.out.println("Boolean="+e1);
		
		//Object to Datatype
		System.out.println("-----------------------------------------------");
		System.out.println("Objects to Data type  using Wrapper Class");
		System.out.println("-----------------------------------------------");
		short z=a1;
		System.out.println(z);
		
		float y=b1;
		System.out.println(y);
		
		double w=c1;
		System.out.println(w);
		
		long  v=f1;
		System.out.println(v);
		
		char u=d1;
		System.out.println(u);
		
		boolean t=e1;
		System.out.println(t);
		

	}
}
