package com.qn51;

interface SimCard{
	
    void sms();
    void call();
}

class Test implements SimCard {
	
	public void sms() {
		
		System.out.println("sms is implemented");
		
	}
	
	public void call() {
		
		System.out.println("call is implemented");
		
	}

}


public class Demo {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.sms();
		t.call();
		
	}

}
