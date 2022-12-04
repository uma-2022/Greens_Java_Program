package org.constructor.prac;

public class Default_Consructor {
	private void m1() {
		System.out.println("m1");

	}
	private void m2() {
		System.out.println("m2");

	}
	
	public static void main(String[] args) {
		// =>  1st method and Memory Wastage
		// new Default_Consructor().m1(); 
		 //new Default_Consructor().m2();
		
		//=>2nd Method &Save memory,using new constructor created
		
		Default_Consructor d = new Default_Consructor();
		d.m1();
		d.m2();
		
	}

}
