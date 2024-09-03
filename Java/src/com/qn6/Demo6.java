package com.qn6;

import com.Employee;

public class Demo6 {
	
public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Sam",1000);
		
		Demo6 d = new Demo6();
				
		d.show(e1);
}

public void show(Employee e) {
	
	System.out.println(e.getId()+ " " + e.getName() + " " + e.getSal());
}
	
}
