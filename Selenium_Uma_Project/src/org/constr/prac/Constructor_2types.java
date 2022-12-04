package org.constr.prac;

public class Constructor_2types {

	byte i = 67;
	char c = 'k';

	public Constructor_2types() {
		Byte i = 107;
		System.out.println(i);

	}

	public Constructor_2types(int a, String b) {
		System.out.println(a);
		System.out.println(b);

	}

	public Constructor_2types(char ch, float d) {
		System.out.println(ch);
		System.out.println(d);
	}

	public static void main(String[] args) {
		Constructor_2types c1 = new Constructor_2types();// Default Constructor
		Constructor_2types c2 = new Constructor_2types(36, "Kavitha Priya");// Parameterized Constructor
		Constructor_2types c3 = new Constructor_2types('S', 234.98f);

	}

}
