package com.tcs.java;
public class Method_Over  {
	public void m1(String a, char ch) {
		System.out.println(a);
		System.out.println(ch);
	}

	public void m1(float e, double d) {
		System.out.println(e);
		System.out.println(d);
	}

	public void m1(int b, boolean boo) {
		System.out.println(b);
		System.out.println(boo);
	}

	public static void main(String[] args) {

		Method_Over m = new Method_Over();
		m.m1("Uma", 'v');
		m.m1(90, false);
		m.m1(234.56f, 677.88888777);
	}
}
