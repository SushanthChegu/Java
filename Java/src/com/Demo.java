package com;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Predicate<Integer> p = 
				
		Supplier<Double> s = ()-> Math.random();
		
		System.out.println(s.get());

	}

}
