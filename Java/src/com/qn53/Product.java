package com.qn53;

import java.util.Objects;

public class Product {
	
	public Product(int id, String name, int price, int qnty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qnty = qnty;
	}
	private int id;
	private String name;
	private int price;
	private int qnty;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qnty=" + qnty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, qnty);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name) && price == other.price && qnty == other.qnty;
	}

}
