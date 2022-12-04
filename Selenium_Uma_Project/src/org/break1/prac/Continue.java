package org.break1.prac;

public class Continue {
	public static void main(String[] args) {
		String s[]=new String[5];
		s[0]="Kavitha";
		s[1]="Rama";
		s[2]="Radha";
		s[3]="Shraya";
		s[4]="Amirtha";
		for (String val : s) {
			System.out.println(val);
			if(val=="Shraya")
			{
				System.out.println("She is my Roommate");
			    continue; 
			}
		}  
			
			
		}
	}


