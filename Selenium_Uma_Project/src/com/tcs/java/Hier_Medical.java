package com.tcs.java;

public class Hier_Medical extends Hier_College {
	public void dentist() {
		System.out.println("I am a dentist");
	}

	public void surgeon() {
		System.out.println("I am surgeon");
	}

	public static void main(String[] args) {
		Hier_Medical M = new Hier_Medical();
		M.college();
		M.dentist();
		M.surgeon();
	}

}
