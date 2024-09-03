package com.qn56;

import com.qn53.Product;

public class Demo {

	public static void main(String[] args) {
		Product p1 = new Product(1, "Apple", 100, 20);
		Product p2 = new Product(1, "Ball", 200, 40);
		
		System.out.println(p1.equals(p2));

	}

}
