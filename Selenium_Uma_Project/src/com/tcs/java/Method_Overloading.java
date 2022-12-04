package com.tcs.java;

public class Method_Overloading {
	private void add(int a,int b) {
	int add1=a+b;	
System.out.println("Integer Addition="+add1);
	}
	private void add(int c,float d) {
		float add2=c+d;
		System.out.println("Int float Addition="+add2);
	}
	private void add(double e,int f,float g) {
		double add3=e+f+g;
		System.out.println("Double int float Addition="+add3);
	}
	private void add(int h,float i,float j) {
		float add4=h+i+j;
		System.out.println("Int float float Addition="+add4);
	}
	
	public static void main(String[] args) {
		Method_Overloading m1=new Method_Overloading();
		m1.add(10,70);
		m1.add(80,23.5f);
		m1.add(456.9,20,4.5f);
		m1.add(20,45.5f,85.5f);
		
	}
	

}
