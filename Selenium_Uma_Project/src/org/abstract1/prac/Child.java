package org.abstract1.prac;

public class Child extends Parent1 {
	
@Override
public void m1() {
	System.out.println("I am in Chid m1 method");
	super.m1();
}
@Override
	public void m2() {
		System.out.println("I am in Child m2 method");
		super.m2();
	}

public static void main(String[] args) {
	Child c=new Child();
	c.m1();
	c.m2();
	c.m3();
	Child c1=(Child) new Parent1();//Down Casting
	c1.m3();
}
}
