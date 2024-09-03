package com.qn30;

import com.Employee;

public class Demo {
	
	public static Employee m1(){
		
		Employee e1 = new Employee(101,"Sam",1000);
		
		return e1;
		
	}


	public static void main(String[] args) {
		
		Employee e2 = m1();
		
		e2.display();	
	}


}
