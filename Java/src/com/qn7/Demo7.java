package com.qn7;

import com.Employee;

public class Demo7 {
	
public static void main(String[] args) {
		
		Employee emp1 = new Employee(101,"Sam",1000);
		Employee emp2 = new Employee(102,"Cam",2000);
		
		show(emp1, emp2);
}

public static void show(Employee e1, Employee e2 ) {
	
	System.out.println(e1.getId()+ " " + e1.getName() + " " + e1.getSal());
	System.out.println(e2.getId()+ " " + e2.getName() + " " + e2.getSal());
}

}
