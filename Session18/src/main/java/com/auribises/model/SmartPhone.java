package com.auribises.model;

public class SmartPhone extends Phone{
	
	String os;
	String features;
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	SmartPhone(String os, String features) {
		this.os = os;
		this.features = features;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "SmartPhone [os=" + os + ", features=" + features + ", screenSize=" + screenSize + ", ram=" + ram
				+ ", memory=" + memory + ", pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

}
