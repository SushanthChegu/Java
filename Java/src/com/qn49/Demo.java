package com.qn49;

class Test {
	
	public void Print() {
		System.out.println("Printing");
	}

}

class Test1 extends Test {
	
	public void Print() {
		
		System.out.println("Print overrided");
	}
	

}

public class Demo extends Test1 {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.Print();
				
	}

}
