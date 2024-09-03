package com.qn12;

public class Demo12 {
	
	private static int total = 10;
	public static void main(String[] args) {
		
		System.out.println(total);
		System.out.println(Demo12.total);
		
		Demo12 d = new Demo12();
		
		System.out.println(d.total);
	}


}
