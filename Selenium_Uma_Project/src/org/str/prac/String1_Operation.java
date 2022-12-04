package org.str.prac;

public class String1_Operation {
	public static void main(String[] args) {
		String a="SElenium TEsting";
		String b="selenium testing";
		
		int len1=a.length(); //Length
		System.out.println("Length of the string: "+len1);
		
		boolean equals1=a.equals(b);//Equals
		System.out.println("Equals: "+equals1);	
		
		boolean equals_Ign=a.equalsIgnoreCase(b);//EqualIgnoreCase
		System.out.println("Equals Ignore: "+equals_Ign);
		
		String upper1 = b.toUpperCase();//UpperCase
		System.out.println("String Uppercase: "+upper1);
		
		String lower1 = a.toLowerCase();//LowerCase
		System.out.println("String Lowercase: "+lower1);
		
		char ch1 = a.charAt(1);//CharAt
		System.out.println("String CharAt: "+ch1);
		
		int index1 = a.indexOf('E');//Indexof
		System.out.println("String Indexof: "+index1);	
		
		int lastindex1 = b.lastIndexOf('t');//LastIndex
		System.out.println("String LastIndex: "+lastindex1);
		
		boolean contains1 = b.contains("test");//Contains
		System.out.println("String Contains: "+contains1);
		
		boolean starts1 = a.startsWith("vel");//StartsWith
		System.out.println("Starts With: "+starts1);
		
		boolean ends1 = a.endsWith("ing");//EndsWith
		System.out.println("Ends With: "+ends1);
				
		
	}

}
