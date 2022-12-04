package org.bank.override;

public class Child_Override extends Parent_Override {
	@Override
	public void p1() {
		System.out.println("P1 from child");
		super.p1();
	}
	@Override
	public void p2() {
		System.out.println("P2 from child");
		super.p2();
	}
	@Override
	public void p3() {
		System.out.println("P3 from child");
		super.p3();
	}
	@Override
	public void p4() {
		System.out.println("P4 from child");
		super.p4();
	}
	@Override
	public void p5() {
		System.out.println("P5 from child");
		super.p5();
	}
	@Override
	public void p6() {
		System.out.println("P6 from child");
		super.p6();
	}
	private void p7() {
		System.out.println("P7 from child");
	}
	public static void main(String[] args) {
		Child_Override c=new Child_Override();
		c.p1();
		c.p2();
		c.p3();
		c.p4();
		c.p5();
		c.p6();
		c.p7();
		
	}

}
