package org.stringBuilder.prac;

public class String_Builder {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Java");
		System.out.println(s);
		int hashCode1 = s.hashCode();
		System.out.println(hashCode1);

		StringBuilder t = new StringBuilder("Program");
		System.out.println(t);
		int hashCode2 = t.hashCode();
		System.out.println(hashCode2);

		StringBuilder append1 = t.append(s);
		System.out.println(append1);
		int hashCode3 = append1.hashCode();
		System.out.println(hashCode3);

		String k = "Uma";
		System.out.println(k);
		int address = k.hashCode();
		System.out.println(address + '\n');

		String l = "Maheswari";
		System.out.println(l);
		int address1 = l.hashCode();
		System.out.println(address1 + '\n');

		String concat2 = k.concat(l);
		System.out.println(concat2);
		int address2 = concat2.hashCode();
		System.out.println(address2);

	}

}
