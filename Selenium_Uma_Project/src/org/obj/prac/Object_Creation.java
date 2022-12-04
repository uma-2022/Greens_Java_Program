package org.obj.prac;

public class Object_Creation {
	private int m1() {
		int a = 89;
		return a;
	}

	private String m2() {
		String s = "uma";
		return s;
	}

	private float m3() {
		float f = 4.5f;
		int a = 45;
		float add = f + a;
		return add;

	}

	private boolean m4() {
		boolean b = true;
		return b;

	}

	public static void main(String[] args) {
		Object_Creation O = new Object_Creation();
		int r = O.m1();// Assign variable to obj.name=method_name();
		System.out.println(r);
		String w = O.m2();
		System.out.println(w);
		float s = O.m3();
		System.out.println("Addition value is:" + s);
		boolean b = O.m4();
		System.out.println(b);
	}

}
