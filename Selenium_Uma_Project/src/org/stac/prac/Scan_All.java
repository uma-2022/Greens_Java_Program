package org.stac.prac;

import java.util.Scanner;

public class Scan_All {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee name:"); 
		String name = s.nextLine();
		System.out.println("Employee name is:"+name);
		System.out.println("Enter the Employee age:");
		byte age= s.nextByte();
		System.out.println("Employee age is:"+age);
		System.out.println("Enter the Employee Id:");
		short id = s.nextShort();
		System.out.println("Employee Id:"+id);
		System.out.println("Enter the Employee salary:");
		int sal = s.nextInt();
		System.out.println("Employee Salary:"+sal);
		System.out.println("Enter the Employee EMI details:");
		float emi = s.nextFloat();
		System.out.println("The Employee EMI details:");
		System.out.println("Enter the Employee Monthly Expenses details:");
		long monthly = s.nextLong();
		System.out.println("The Employee Monthly Expenses details:"+monthly);
		
	}
	

}
