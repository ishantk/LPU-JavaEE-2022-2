package com.auribises.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {
	
	String name;
	String phone;
	String operatingHours;
	float ratings;
	
	Address address; 				// HAS-A Relationship | 1 to 1
	
	List<String> searchKeywords; 	// HAS-A Relationship | 1 to many
	
	// Assignment: Create Getter and Setter for the menu list and configure a list of FoodItems in xml file
	List<FoodItem> menu; 			// HAS-A Relationship | 1 to many
	
	public Restaurant() {
		System.out.println("[Restaurant] - Object Constrcuted with default Constructor");
	}
	
	
	// Constructor Injection
	// @Autowired Annotation makes the Spring FW IOC container to understand automatically to use Constructor for injecting the address in Restaurant
	//@Autowired
	Restaurant(Address address) {
		System.out.println("[Restaurant] - Object Constructed with Address as input to Constructor");
		System.out.println("[Restaurant] - Constructor Injection");
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	public float getRatings() {
		return ratings;
	}

	// the method takes value and not reference :)
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public Address getAddress() {
		return address;
	}

	// setAddress method takes reference as input rather than value :)
	// input to the method is Address which is reference type :)
	@Autowired
	public void setAddress(Address address) {
		System.out.println("[Restaurant] - Setter Injection");
		this.address = address;
	}
	

	public List<String> getSearchKeywords() {
		return searchKeywords;
	}

	// Assignment: Explore AutoWiring on 1 to many relationship :)
	// setter injection for 1 to many relationship
	public void setSearchKeywords(List<String> searchKeywords) {
		this.searchKeywords = searchKeywords;
	}


	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours + ", ratings="
				+ ratings + ", address=" + address + "]";
	}
	
	

}
