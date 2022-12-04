package org.bank.override;

public class Upcasting_Class2 extends Upcasting_Class1 {
	 public void method1() {
		System.out.println("Class2 Method1");
      //super.method1();
	}
	 public void method2() {
		 System.out.println("Class2 Method2");
	}
	 public  void method3() {
		 System.out.println("Class2 Method3");

	}
	 public void method4() {
		 System.out.println("Class2 Method4");

	}
	public static void main(String[] args) {
		Upcasting_Class2 up2=new Upcasting_Class2();
		up2.method1();
		up2.method2();
		up2.method3();
		up2.method4();
			
	}

}
