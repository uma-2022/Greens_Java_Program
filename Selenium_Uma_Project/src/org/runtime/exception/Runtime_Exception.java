package org.runtime.exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Runtime_Exception {
public static void main(String[] args) {
	try {
	int a=34;
	System.out.println(a/0);
}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception handled");
	}
	
	try
	{
		String a=null;
		System.out.println(a.charAt(0));
	}
	catch(NullPointerException e)
	{
		System.out.println("Null Pointer Exception handled ");
	}
	try
	{
		//int arr[]= new int[5];
		//arr[7]=13;
		int[] m= {1,2,3};
		System.out.println(m[13]);
		
	}
	catch(ArrayIndexOutOfBoundsException  e)
	{
	System.out.println("ArrayIndexOutOfBound Exception handled");
	}
	
	try
	{
		int i = Integer.parseInt("Hai");
		System.out.println(i);
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
	System.out.println("Number Format Exception handled");
}
	try
	{
		String str="selenium";
		System.out.println(str.charAt(12));
		
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("StringIndexOutOfBounds Exception Handled");
	}
	
	try
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if( num>10)
			System.out.println("True"); 
		else
			System.out.println("False"); 	
		
	}
	catch(InputMismatchException e) {
		
		System.out.println("InputMismatch Exception handled");
}
	
	try
	{
		int[] z= {1,6,10};
		System.out.println(z[-1]);
	}
	catch(IndexOutOfBoundsException e)
	{
		e.printStackTrace();
		System.out.println("IndexOutOfBoundsException handled");
	}
	

	catch(Exception e)
	{
		System.out.println("Caught Exception");
	}
	finally
	
	{
		System.out.println(("I am in Finally block"));
		
	}
}
}
