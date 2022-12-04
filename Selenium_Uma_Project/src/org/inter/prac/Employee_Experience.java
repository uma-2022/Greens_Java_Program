package org.inter.prac;

public interface Employee_Experience extends Employee_Details {
	@Override
	public default void name(String a) {
		System.out.println("Name:Mr.D.Kavitha"+a);
			}
	@Override
	public default void address(String b) {
		System.out.println("Address:Adayar,Chennai"+b);
			}
	void education();
	void experience();
	public static void main(String[] args) {
		Employee_Experience exp=new Employee_Hike();
		exp.name("Raja");
		exp.address("Madurai");
		exp.education();
		exp.experience();
	   }
}
	
	
	
	
		
