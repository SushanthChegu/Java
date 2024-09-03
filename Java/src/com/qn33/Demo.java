package com.qn33;

import com.Employee;

public class Demo {
	
	public static void show(Employee e){
		
		e.display();
	}
	public static void process(Employee e){
		
		e.setId(101);
		e.setName("Sam");
		e.setSal(1000);	
	}
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		process(emp1);
		
		show(emp1);
		
		//do required changes in main,process and show method
		//create empty employee object here
		//add data into that empty object using process method
		//display employee object with data in show method
	}


}
