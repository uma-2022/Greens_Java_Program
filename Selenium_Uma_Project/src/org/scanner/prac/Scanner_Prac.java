package org.scanner.prac;

import java.util.Scanner;

public class Scanner_Prac {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.nextLine();
		System.out.println("Enter your mobile number:");
		long number = s.nextLong();
		System.out.println("Looking Mobile model:");
		String model = s.next();
		System.out.println("Select version 3-5");
		byte ver = s.nextByte();
		System.out.println("you want to check the full amount deatils with GST" + "T/F");
		boolean b = s.nextBoolean();
		if (b == true) {
			System.out.println("Down payment range is:0000 to 20000");
			short payment = s.nextShort();
			System.out.println("Interset % rate is 4.5% to 8.9%");
			float interst = s.nextFloat();
			System.out.println("Monthly Emi payment:");
			double d = s.nextDouble();
			System.out.println("Name=" + name + '\n' + "Mobile number=" + number + '\n' + "Mobile Model:" + model);
			System.out.println("Initial Amount:" + payment + '\n' + "Interest Rate%" + interst + '\n' + "Monthly EMI:" + d);
			System.out.println("Contact us:0340 0340");
		} else {
			System.out.println("Visit site :WWW.samsung.com");
		}
	}

}
