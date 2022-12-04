package org.constructor.prac;

public class Non_Parameterized {
	public Non_Parameterized()
	{
		System.out.println("Non Parameterized");
	}
	private void m1() {
		System.out.println("M1");
	}
	private void m2() {
		System.out.println("M2");
	}
	public static void main(String[] args) {
		//One Method
		Non_Parameterized n=new Non_Parameterized();
		n.m1();
		n.m2();
		
		//Second Method
		// new Non_Parameterized().m1();//non_para+method  
		// new Non_Parameterized().m2();//non_para+method
	}


}
