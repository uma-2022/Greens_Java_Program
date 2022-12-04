package org.constructor.prac;

public class Parameterized {
	public Parameterized() {
		System.out.println("Non-Parameterized");
	}

	public Parameterized(int a) {
		System.out.println(a);
	}

	private void m1() {

		System.out.println("m1");
	}

	private void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
		//1st Method
		//Parameterized p = new Parameterized(5); 
		//p.m1();
		//p.m2();
		
		//2nd Method
		new Parameterized().m1();
		new Parameterized(13).m2();

	}

}
