package com.qn5;

import com.Employee;

public class Demo5 {
	
public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Sam",1000);
				
		show(e1);
}

public static void show(Employee e) {
	
	System.out.println(e.getId()+ " " + e.getName() + " " + e.getSal());
}
	
}
