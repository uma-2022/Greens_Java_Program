package org.oper.prac;

public class Operator_java {
	static int y=90;
	final float P=3.14f;
	float d=3;
	private void add() {
		int a=3;
		int b=40;
		int c=a+b;
		    c+=100;
		System.out.println(a>=b||b>a);
		System.out.println(c);
		//System.out.println();
		
	}
	public static void main(String[] args) {
		Operator_java o=new Operator_java();
		o.add();
		System.out.println(y);
		System.out.println(o.P);
	}

}
