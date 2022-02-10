package com.auribises.model;

public class Product {
	
	Integer pid;
	String name;
	Integer price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	Product(Integer pid, String name, Integer price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

}
