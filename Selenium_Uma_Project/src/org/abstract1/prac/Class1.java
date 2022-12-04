package org.abstract1.prac;

public abstract class Class1 {
	
public abstract void car();
public abstract void van(); 
public void truck() {
	System.out.println("I am in Truck from class1");

}

public static void main(String[] args) {
	Class1 c1=new Class2();
	c1.truck();
	c1.car();
	c1.van();
	//c1.lorry();
	
}
}


