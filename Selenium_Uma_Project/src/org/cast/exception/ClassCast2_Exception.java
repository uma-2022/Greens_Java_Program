package org.cast.exception;

public class ClassCast2_Exception extends ClassCast1_Exception {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("I am in child M1");
		super.m1();
	}
	public static void main(String[] args) {
		ClassCast2_Exception c2=new ClassCast2_Exception();//Child
		c2.m1();
		ClassCast2_Exception c3=(ClassCast2_Exception) new ClassCast1_Exception();
		c3.m2();
	}

}
