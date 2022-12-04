package org.multiple.prac;

public class Multiple implements Parent1,Parent2,Parent3 {
	@Override
	public void m1() {
		System.out.println("I am in 1st interface");
		
	}
	@Override
	public void m2() {
		System.out.println("I am in 1st interface");
	}
	@Override
	public void m3() {
		System.out.println("I am in 2nd interface");		
	}
	@Override
	public void m4() {
		System.out.println("I am in 2nd interface");
	}
	@Override
	public void m5() {
System.out.println("I am in 3rd interface");		
	}
	@Override
	public void m6() {
		System.out.println("I am in 3rd interface");		
	}
	public void m7() {
		System.out.println("I am in m7");
		
	}
	public void m8() {
		System.out.println("I am in m8");
		
	}
	public static void main(String[] args) {
		Multiple m=new Multiple();
		m.m1();
		m.m2();
		m.m3();
		m.m4();
		m.m5();
		m.m6();
		m.m7();
		m.m8();
	}
	
	
	

}
