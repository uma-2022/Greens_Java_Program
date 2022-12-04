package com.tcs.testing;

public class Java_Day4 {
	public void apple() {
		System.out.println("I am apple");
	}

	private void orange() {
		System.out.println("I am orange");
	}

	protected void grape() {
		System.out.println("I am grape");
	}

	void pomegrante() {
		System.out.println("I am pomegrante");
	}

	public static void main(String[] args) {
		Java_Day4 fruits=new Java_Day4();
		fruits.apple();//public---->Green color
		fruits.orange();//private---->Red color
		fruits.grape();//protected------->Yellow color
		fruits.pomegrante();//default

	}

}
