package com.qn50;

interface Int{
	
	void a();
	void b();
	
}

public class Demo implements Int{
	
	public void a() {
		
		System.out.println("Method a is implemented");
		
	}
	
	public void b() {
		
		System.out.println("Method b is implemented");
		
	}


public static void main(String[] args) {
	
	Demo d = new Demo();
	
	d.a();
	d.b();
		

	}

}
