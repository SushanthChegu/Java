package com.qn31;

import com.Employee;

public class Demo {
	
	public static Object m1(){
		
		Employee e1 = new Employee(101,"Sam",1000);
		return e1;
	}
	public static void main(String[] args) {
		
		Employee e2 = (Employee) m1();
		
		e2.display();
	}


}
