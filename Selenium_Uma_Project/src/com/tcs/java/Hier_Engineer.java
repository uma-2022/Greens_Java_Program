package com.tcs.java;

public class Hier_Engineer extends Hier_College {
	public void eee() {
		System.out.println("I am EEE student");

	}

	public void ece() {
		System.out.println("I am ECE student");
	}
	public static void main(String[] args) {
		Hier_Engineer E=new Hier_Engineer();
		E.college();
		E.eee();
		E.ece();
	}

}
