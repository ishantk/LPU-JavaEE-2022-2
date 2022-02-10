package com.auribises.model;

public class Customer {
	
	Integer cid;
	String name;
	String phone;
	String email;
	
	Address address; // HAS-A Relationship | 1 to 1 mapping
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	Customer(Integer cid, String name, String phone, String email, Address address) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
				+ address + "]";
	}

}
