package org.bank.override;

public class Type_Casting {
		
	public static void main(String[] args) {
		//Widening
		byte a=78;
		int i=a;
		System.out.println(i);
		int s=34;
		long l=(s);
		System.out.println(l);
		
	   //Narrowing
		
		int d=650;
		byte b=(byte)d;
		System.out.println(b);
		long k=2345;
		short t=(short)k;
		System.out.println(t);
		
	}

}
