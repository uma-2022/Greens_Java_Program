package org.abstract1.prac;

public class Class2 extends Class1 {
	
	public void lorry() {
		System.out.println("I am in Lorry from Class2");

	}
	public void bike() {
		System.out.println("I am in Bike from Class2");
	}
	
	@Override
	public void car() {
		System.out.println("I am in Car from Class1");
		
	}
	@Override
	public void van() {
	System.out.println("I am in Van from class1");
		
	}
	public static void main(String[] args) {
		
		Class2 c2=new Class2();
		c2.lorry();
		c2.bike();
		c2.car();
		c2.van();
		c2.truck();
		
	}

}
