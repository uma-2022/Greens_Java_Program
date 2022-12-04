package org.bank.override;

public class Upcasting_Class1 {
	public void method1() {
		System.out.println("I am in Class1--Method1");

	}
	public void method2() {
		System.out.println("I am in Class1--Method2");
	}
	public void method3() {
		System.out.println("I am in Class1--Method2");
	}
	public static void main(String[] args) {
		 Upcasting_Class1 up1=new  Upcasting_Class2();
		 up1.method1();
		 up1.method2();
		 up1.method3();
		
	}

}
