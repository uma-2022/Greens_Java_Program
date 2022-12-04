package org.inter.prac;

public class Employee_Hike implements Employee_Experience, Employee_Performance {

	public void designation() {
		System.out.println("Role: Solution Architect");
	}

	public void salary(int d) {
		System.out.println("Hike:60% hike offered---"+d);
	}

	@Override
	public void education() {
		System.out.println("Qualification:M.E Computer Science Engineering");
	}

	@Override
	public void experience() {
		System.out.println("Experience:15years experience");
	}

	@Override
	public void name(String a) {
		System.out.println("Name:Mrs."+a);

	}

	@Override
	public void address(String b) {
		System.out.println("Address:"+b);
	}

	@Override
	public void grade(String e) {
		System.out.println("Grade:"+ e +" Grade");
	}

	@Override
	public void band(String d) {
		System.out.println("Band:"+d+"band");
	}

	public static void main(String[] args) {
		Employee_Hike hike = new Employee_Hike();
		hike.name("Uma");
		hike.address("Tiruvarur");
		hike.education();
		hike.experience();
		hike.designation();
		hike.salary(50000);
		hike.grade("C");
		hike.band("Red");
	}
}
