package com.qn28;

public class Demo {
	
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		
		int ret = m1(15);
		
		int total = 100 + ret;
		System.out.println(total);
	}


}
