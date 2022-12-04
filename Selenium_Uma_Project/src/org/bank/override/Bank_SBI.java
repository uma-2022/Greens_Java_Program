package org.bank.override;

public class Bank_SBI extends Bank_Interest_Rate{
	public void bank_Interest(float b) {
		System.out.println("SBI bank");
		super.bank_Interest(b);
		
			}
	public static void main(String[] args) {
		Bank_SBI s=new 	Bank_SBI();
		s.bank_Interest(7.5f);
		
	}

}
