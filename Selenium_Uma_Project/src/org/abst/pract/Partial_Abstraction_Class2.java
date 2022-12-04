package org.abst.pract;

public class Partial_Abstraction_Class2 extends Partial_Abstraction_Class1 {

	@Override
	public void a1() {
		System.out.println("I am in Absttaction a1");
	}

	@Override
	public void a2() {
		System.out.println("I am in Abstraction a2");
	}

	@Override
	public void a3() {
		System.out.println("I am in Abstraction a3");
	}

	@Override
	public void a4() {
		System.out.println("I am in Abstraction a4");
	}

	private void a5() {
		System.out.println("I am in Non Abstact in class2");
	}

	public static void main(String[] args) {
		Partial_Abstraction_Class2 p2=new Partial_Abstraction_Class2();
		p2.a1();
		p2.a2();
		p2.a3();
		p2.a4();
		p2.a5();
		p2.b1();
		p2.b2();
		p2.b3();
		p2.b4();
	}	
}
