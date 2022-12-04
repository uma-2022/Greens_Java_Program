package org.bank.override;

public class Bank_ICICI extends Bank_Interest_Rate{
	public void bank_Interest(float a) {
		System.out.println("ICICI bank");
		super.bank_Interest(a);
	}
	public static void main(String[] args) {
		
		Bank_ICICI i=new Bank_ICICI();
		i.bank_Interest(9.4f);
	}

}
