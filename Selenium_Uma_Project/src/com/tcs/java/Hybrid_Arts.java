package com.tcs.java;

public class Hybrid_Arts extends Hier_Engineer {
	public void arts() {
		System.out.println("I am Arts student");
	}

	public static void main(String[] args) {
		Hybrid_Arts A = new Hybrid_Arts();
		A.college();
		A.ece();
		A.eee();
		A.arts();
	}

}
