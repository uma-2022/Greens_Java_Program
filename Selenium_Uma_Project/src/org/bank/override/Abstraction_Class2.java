package org.bank.override;

public class Abstraction_Class2 extends Abstaction_Class1 {
@Override
public void veg1() {
	System.out.println("I am in Child-Veg1");
	super.veg1();
}
@Override
	public void veg2() {
	System.out.println("I am in Child-Veg2");
	super.veg2();
	}
@Override
	public void veg3() {
	System.out.println("I am in Child-Veg3");
	super.veg3();
	}
public void veg4() {
	System.out.println("I am in Child-Veg4");

}
public static void main(String[] args) {
 //Abstraction_Class2 c2=(Abstraction_Class2)new Abstraction_Class1();//Cannot done downcasting
	Abstraction_Class2 c2=new Abstraction_Class2();
	c2.veg1();
	c2.veg2();
	c2.veg3();
	c2.veg4();
	c2.veg5();
}
}
