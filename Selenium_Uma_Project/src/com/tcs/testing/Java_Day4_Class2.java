package com.tcs.testing;

public class Java_Day4_Class2 extends Java_Day4 {
	public void kiwi()
	{
		System.out.println("I am kiwi");
	}
	public static void main(String[] args) {
		//Java_Day4 fruits1=new Java_Day4();//Suppose u use extends don't create object
		Java_Day4_Class2 fruits2=new Java_Day4_Class2();
		fruits2.kiwi();
		fruits2.apple();
		//fruits1.orange();//Declared in private in parent class----->Java_Day4
		fruits2.grape();
		fruits2.pomegrante();
		
	}

}
