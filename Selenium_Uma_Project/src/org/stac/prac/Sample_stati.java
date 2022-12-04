package org.stac.prac;



public class Sample_stati {
	static int j=39;
	final float a=3.14f;
	public static void m1() {
		System.out.println("Static Method");
	    System.out.println("Sample value is :"+j);

	}
	private void m2() {
System.out.println("Non static Method");
	}
	public final void m3() {
System.out.println("Final Method");
	}
	public static void main(String[] args) {
		Sample_stati S=new Sample_stati();
		S.m2();
		m1();
		S.m3();
		System.out.println("Final value is :"+S.a);
		System.out.println("Static value is :"+j);
	}

}
