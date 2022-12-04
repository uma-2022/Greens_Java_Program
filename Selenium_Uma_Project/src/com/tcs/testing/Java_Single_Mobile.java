package com.tcs.testing;

public class Java_Single_Mobile extends Java_SingleInher_Laptop {

	protected void Nord() {
		System.out.println("I am Nord one Plus ");
	}

	protected void Galaxy() {
		System.out.println("I am Galaxy");
	}

	public static void main(String[] args) {

		Java_Single_Mobile mobile = new Java_Single_Mobile();
		mobile.samsung();
		mobile.dell();
		mobile.hp();
		mobile.Nord();
		mobile.Galaxy();

	}
}
