package com.qn24;

import com.Employee;

public class Demo {
	
	public static void m1(Employee e){
		
		e.display();
	}
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Sam",1000);
		
		m1(emp1);
	}


}
