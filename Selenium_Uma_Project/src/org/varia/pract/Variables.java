package org.varia.pract;

public class Variables {
	int j=80;//Class or Instance variable
	static float a=12.7f;//Static variable
	static int s;
	static int i=20;
	final int f=67;//Final variable
	
	public void m2() {
		int j=45;
	    
		System.out.println("Value of global variable i is:" + j);
		
	}
	public void m1() {
		int j=20;// Local variable declaration
		j = 10;// Initialization
		final int l=47;
		System.out.println("Value of local variable i is:" + j);
		System.out.println("Value of final variable  l is:" + l);
	}
	public final void m3() {
System.out.println(f);
	}
	public static void main(String[] args) {
	
		Variables v = new Variables();
		v.m2();
		v.m1();
		System.out.println(v.j);
		System.out.println(a);//static variable declared and intialized
		System.out.println(i);// //Static variable declaration only
		System.out.println(v.f);//final variable
		System.out.println(v.s);//default variable	
		v.m3();
	}

}
