package org.scanner.prac;

import java.util.Scanner;

public class Scanner_Example {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Roll No:");
		byte no = s.nextByte();
		System.out.println("Enter Branch Code(100-105)");
		short code = s.nextShort();
		System.out.println("Enter your  name:");
		String name = s.nextLine();
		s.nextLine();
		System.out.println("Enter your Mobile number ");
		long mob = s.nextLong();
		System.out.println("Enter your HSC marks");
		float marks = s.nextFloat();
		System.out.println("Enter your father's annual income");
		int income = s.nextInt();
		System.out.println("Enter the  Management fees with Gst value");
		double fees = 0.8 * s.nextDouble();
		System.out.println("Given student details are correct(T/F)?");
		boolean details = s.nextBoolean();
		s.nextLine();
		System.out.println("Engineering Student Details");
		System.out.println("***************************");
		System.out.println("Student No:" + no + '\n' + "Student Name:" + name + '\n' + "Branch Code:" + code);
		System.out.println("Mobile Number" + mob + '\n' + "HSC Marks:" + marks);
		System.out.println("Father's Annual Income:" + income + '\n' + "Management Fees :" + fees);

	}
}
