package com.qn34;

import java.util.Scanner;

import com.Employee;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int id =sc.nextInt();
		
		System.out.println("Enter the Employee Name");
		String name =sc.next();
		
		System.out.println("Enter the Employee Salary");
		int sal =sc.nextInt();
		
		Employee emp1 = new Employee(id, name, sal);
		
		Demo d = new Demo();
		
		d.show(emp1);
			
	}

	public void show(Employee e){
		e.display();
	}


}
