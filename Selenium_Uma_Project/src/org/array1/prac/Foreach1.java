package org.array1.prac;

public class Foreach1 {
	public static void main(String[] args) {
		String a[]=new String[10];
		a[0]="Sunday";
		a[1]="Monday";
		a[2]="Tuesday";
		a[3]="Wednesday";
		a[4]="Thursday";
		a[5]="Friday";
		a[6]="Saturday";
		a[7]="Sun";
		a[8]="Moon";
		a[9]="Sky";
		
		System.out.println("Array Values are:");
		System.out.println("################"); 
		for (String value : a) {
			
		System.out.println(value);
		}	
	}
}

