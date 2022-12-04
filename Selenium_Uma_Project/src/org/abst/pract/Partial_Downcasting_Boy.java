package org.abst.pract;

public class Partial_Downcasting_Boy extends Partial_Downcasting_Human {
	@Override
	public void eat() {
		System.out.println("I am eating");
		super.eat();
	}
	@Override
	public void run() {
		System.out.println("I am running");
		super.run();
	}
	public void work() {
		System.out.println("I am working");
	}
	public static void main(String[] args) {

		Partial_Downcasting_Boy B = (Partial_Downcasting_Boy) new Partial_Downcasting_Human();
		B.eat();
		B.run();
		B.play();
		B.work();
	}
}
