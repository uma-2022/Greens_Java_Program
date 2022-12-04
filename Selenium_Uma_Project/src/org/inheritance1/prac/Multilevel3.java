package org.inheritance1.prac;

public class Multilevel3 extends Multilevel2 {
	public void job() {
System.out.println("I am in job from me");
	}
	public void platinam() {
System.out.println("I am in Platinam from me");
	}
	public static void main(String[] args) {
		Multilevel3 m3=new Multilevel3();
		m3.house();
		m3.Land();
		
		m3.apartment();
		m3.car();
		
		m3.job();
		m3.platinam();
	}
	
	

}
