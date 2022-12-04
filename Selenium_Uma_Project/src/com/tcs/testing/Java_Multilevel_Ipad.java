package com.tcs.testing;

public class Java_Multilevel_Ipad extends Java_Single_Mobile{
	
	private void Ipadapple() {
		System.out.println("I am Ipad apple");
	}

	protected void Ipadsamsung() {
		System.out.println("I am Ipad Samsung");
	}
public static void main(String[] args) {
	Java_Multilevel_Ipad ipad=new Java_Multilevel_Ipad();
	ipad.samsung();
	ipad.dell();
	ipad.hp();
	ipad.Nord();
	ipad.Galaxy();
	ipad.Ipadapple();
	ipad.Ipadsamsung();
	
}

}
