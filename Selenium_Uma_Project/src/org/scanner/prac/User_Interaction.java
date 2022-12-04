package org.scanner.prac;

import java.util.*;

public class User_Interaction {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Bank Account number:");
		long l = s.nextLong();
		System.out.println("The Bank Account number is:" + l);

		System.out.println("Enter the housing loan interst");
		float f = s.nextFloat();
		System.out.println("Housing loan interest rate is:" + f);

		System.out.println("Enter the monthly  EMI amount");
		double d = s.nextDouble();
		System.out.println("EMI amount is:" + d);

		System.out.println("Is the account verified?");
		boolean b = s.nextBoolean();
		System.out.println("Verified:"+b);
	}

}
