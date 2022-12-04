package org.bank.override;

public class Abstaction_Class1 {
	public void veg1() {
		System.out.println("I am in Parent-Veg1");
	}
	public void veg2() {
		System.out.println("I am in  Parent-Veg2");
	}
	public void veg3() {
		System.out.println("I am in  Parent-Veg3");
	}
	public void veg5() {
		System.out.println("I am in  Parent-Veg5");
	}
	public static void main(String[] args) {
		
	Abstaction_Class1 c1=new Abstraction_Class2();
	c1.veg1();
	c1.veg2();
	c1.veg3();
	c1.veg5();
	}

}
