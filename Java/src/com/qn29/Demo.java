package com.qn29;

public class Demo {
	
	public static float m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		
		int ret = (int) m1(15);
		
		int total = 100 + ret;
		System.out.println(total);
	}


}
