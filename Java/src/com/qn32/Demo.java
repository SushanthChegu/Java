package com.qn32;

public class Demo {
	
	public static int m1(int i){
		return i*i;
	}
	public static void main(String[] args) {
		
		m1(35);
		Demo.m1(35);
		
		Demo d = new Demo();
		
		d.m1(35);
	}


}
