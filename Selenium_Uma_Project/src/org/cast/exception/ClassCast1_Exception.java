package org.cast.exception;

public class ClassCast1_Exception {

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("I am in Parent M1");
	}

	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("I am in Parent M2");
	}

	public static void main(String[] args) {
		ClassCast1_Exception c1=new ClassCast1_Exception();
		c1.m1();
		c1.m2();

	}

}
