package com.qn57;

import com.Employee;

public class Demo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "SAM", 1000);
		Employee e2 = new Employee(102, "CAM", 2000);
		Employee e3 = new Employee(102, "CAM", 2000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1 == e2);
		
		System.out.println(e2.equals(e3));
		System.out.println(e2 == e3);

	}

}
