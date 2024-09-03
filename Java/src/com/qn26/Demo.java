package com.qn26;

import com.Employee;

public class Demo {

	public static void m1(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Sam",1000);
		
		m1(emp1.getId());
	}

}
