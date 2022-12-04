package org.constructor.prac;

public class Static_Method {
	public Static_Method()
	{
		System.out.println("Iam in static");
	}
	private static void m1() {
		System.out.println("M1");
	}
	public static void m2() {
		System.out.println("M2");

	}
	public static void main(String[] args) {
		//Static_Method s=new Static_Method();
		//Without object we can access methods because it is static
		m1();
		m2();
		
	}
	
	

}
