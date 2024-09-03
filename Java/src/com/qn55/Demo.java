package com.qn55;

import com.Employee;

public class Demo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "SAM", 1000);
		Employee e2 = new Employee(101, "SAM", 1000);

		System.out.println(e1.equals(e2));
	}

}
