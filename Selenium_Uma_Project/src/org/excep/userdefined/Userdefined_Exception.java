package org.excep.userdefined;

import java.util.Scanner;

public class Userdefined_Exception {
public static void main(String[] args) throws My_Exception {
	
		int i=59;
		if(i>=60)
		{
		System.out.println("Senior Citizen:");
		}
		else
		{
        throw new My_Exception("Reason:Type number above 60");
		}

}
}
