package org.bank.override;

public class Bank_AXIS extends Bank_Interest_Rate {
	public void bank_Interest(float e) {
		System.out.println("Axis Bank");
		super.bank_Interest(e);
	}

	public static void main(String[] args) {
		Bank_AXIS a = new Bank_AXIS();
		a.bank_Interest(11.8f);

	}

}
