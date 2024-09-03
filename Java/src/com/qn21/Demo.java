package com.qn21;

import com.Employee;

public class Demo {
	
	public static void m1(Employee e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Sam",1000);
		
		m1(e1);
	}


}
