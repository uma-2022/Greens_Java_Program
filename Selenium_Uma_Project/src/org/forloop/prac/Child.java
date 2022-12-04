package org.forloop.prac;

public class Child implements Father, Mother {
	@Override
	public void m1() {
		System.out.println("I am Father");
	}

	@Override
	public void m2() {
		System.out.println("I am Mother");

	}

	private void m3() {
       System.out.println("I am Child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
	}

}
