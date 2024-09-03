package com.qn46;

public class Demo {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(101, "SAM", 1000);
		
		System.out.println("Id is "+e.getId()+ " , " + "Name is " + e.getName() + " , " + "Salary is " + e.getSal());
	}

}
