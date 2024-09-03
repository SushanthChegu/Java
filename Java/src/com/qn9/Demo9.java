package com.qn9;

import com.Employee;

public class Demo9 {
	
	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		
		show(emp);
		
		emp.setSal(emp.getSal() + 100);
		
		show(emp);
		
	}
	
	public static void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
	}
	
}
	
	
