package com.qn10;

import com.Employee;

public class Demo10 {
	
	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		
		Demo10 d = new Demo10();
		
		d.show(emp);
		
		emp.setSal(emp.getSal() + 100);
		
		d.show(emp);
		
	}
	
	public void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
	}

}
