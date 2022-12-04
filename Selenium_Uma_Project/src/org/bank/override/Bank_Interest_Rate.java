package org.bank.override;

public class Bank_Interest_Rate {
	public void bank_Interest(float a) {
        a=a-1.1f; 
		System.out.println("The education interest rate is :" + a + "%");
	}

	public static void main(String[] args) {
		{
			Bank_Interest_Rate bank = new Bank_Interest_Rate();
			bank.bank_Interest(12.9f);

		}

	}
}