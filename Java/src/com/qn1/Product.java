package com.qn1;

public class Product {

	private int id;
	private String name;
	private int price;

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public static void main(String[] args) { 
		
		Product p1 = new Product(1, "Apple", 100);
		
		System.out.println(p1.id +" "+ p1.name +" "+ p1.price);
	
	}

}
