package org.abst.pract;

public abstract class Partial_Abstraction_Class1 {//Abstract class
	public abstract void a1(); //abstract methods
	public abstract void a2(); 		
	public abstract void a3();	
	public abstract void a4();
	public  void b1() { //method signature
		System.out.println("I am in ......>b1");
	}
	public void b2() {
		System.out.println("I am in ......>b2");
	}
	public void b3() {
		System.out.println("I am in ......>b3");
	}
	public void b4() {
		System.out.println("I am in ......>b4");
	}
	
	public static void main(String[] args) {
		Partial_Abstraction_Class1 p1=new Partial_Abstraction_Class2();//upcasting
		p1.a1();
		p1.a2();
		p1.a3();
		p1.a4();
		p1.b1();
		p1.b2();
		p1.b3();
		p1.b4();
		
	}

}
