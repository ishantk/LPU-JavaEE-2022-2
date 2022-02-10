package com.auribises.model;

public class Address {
	
	Integer aid;
	String adrsLine;
	String city;
	int zipCode;
	
	Customer customer; // HAS-A Relationship | 1 to 1 mapping

	public Address() {
		// TODO Auto-generated constructor stub
	}

	Address(Integer aid, String adrsLine, String city, int zipCode, Customer customer) {
		this.aid = aid;
		this.adrsLine = adrsLine;
		this.city = city;
		this.zipCode = zipCode;
		this.customer = customer;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", zipCode=" + zipCode+"]";
	}
}
