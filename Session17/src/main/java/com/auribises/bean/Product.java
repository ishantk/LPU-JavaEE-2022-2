package com.auribises.bean;

public class Product {
	
	final String TAG = "[Product] ";
	
	int id;
	String name;
	String brand;
	int price;
	int stock;
	
	boolean canBuy;
	
	public Product() {
		System.out.println(TAG+"Object created");
	}

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	/*public void purchaseProduct(String deliveryLocation, String deliveryTime, String userEmail) {
		// 1. Pre Processing -> Validate for the Stock
		if(stock > 0) {
			System.out.println(TAG+"Stock Validated !");
			System.out.println(TAG+"Initiating Payment Transaction...");
			System.out.println();
			
			// 2. Core Business Logic
			System.out.println(TAG+"Opening the Bank Page for Transaction of amount "+price);
			System.out.println(TAG+"Thank you "+userEmail+" for buying "+name+" of "+brand);
			System.out.println(TAG+"We will deliver "+name+" at "+deliveryLocation+" by "+deliveryTime);
			System.out.println();
			
			// 3. Post-Processing -> Notify Customer with an email and also to the departments
			System.out.println(TAG+"Email Sent to "+userEmail+" for invoice of "+price);
			System.out.println(TAG+"Notifying Dispatch and Shipment for the product delivery");
			
		}else {
			System.out.println(TAG+"Please come back again. We are out of Stock..");
		}
	}*/
	
	public void purchaseProduct(String deliveryLocation, String deliveryTime, String userEmail) {
		
		if(canBuy) {
			// 2. Core Business Logic
			System.out.println(TAG+"Opening the Bank Page for Transaction of amount "+price);
			System.out.println(TAG+"Thank you "+userEmail+" for buying "+name+" of "+brand);
			System.out.println();
		}else {
			System.out.println(TAG+"Please come back again. We ar eout of Stock..");
		}
	}

	@Override
	public String toString() {
		return TAG+"[id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
	

}
