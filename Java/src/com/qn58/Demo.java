package com.qn58;

import com.Employee;

public class Demo extends Employee {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee(101, "SAM", 1000);
		
		Employee e2 = (Employee)e1.clone();
		
		System.out.println(e2);

	}

}
