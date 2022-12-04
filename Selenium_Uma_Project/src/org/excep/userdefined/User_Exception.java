package org.excep.userdefined;

public class User_Exception {
	public static void main(String[] args) throws My_Exception1 {
		int i = 15;
		if (i >= 35) {
			System.out.println("Pass the Examination");
		} 
		else
		{
			throw new My_Exception1("Reason:Below 35 if fail");
		}
	}
}
