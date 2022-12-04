package org.inter.prac;

public interface Employee_Performance {
	void grade(String c);
	void band(String d);
	public static void main(String[] args) {
		 Employee_Performance per=new  Employee_Hike();
		 per.grade("B");
		 per.band("Green");
	}
}
