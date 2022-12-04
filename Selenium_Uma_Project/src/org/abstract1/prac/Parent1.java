package org.abstract1.prac;


public class Parent1 {

	public void m1() {
		System.out.println("I am in m1");
	}
	public void m2() {
		System.out.println("I am in m2");

	}
	public void m3() {
		System.out.println("I am in m3 from Parent");
	}
	public static void main(String[] args) {
		Parent1 p1=new Child();//Upcasting
		p1.m1();
		p1.m2();
		p1.m3();
	}
	
}
