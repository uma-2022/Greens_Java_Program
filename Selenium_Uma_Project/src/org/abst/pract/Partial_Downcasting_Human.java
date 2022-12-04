package org.abst.pract;

public  class Partial_Downcasting_Human {
	public  void eat()
	{
		System.out.println("I am Playing");
	}
	
	public  void run()
	{
		System.out.println("I am Running");
	}
	public void play() {
		System.out.println("I am Playing");
	}
	public static void main(String[] args) {
		Partial_Downcasting_Human H = new Partial_Downcasting_Boy();
		H.eat();
		H.run();
		H.play();
				
	}
}
