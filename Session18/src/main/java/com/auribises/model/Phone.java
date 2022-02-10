package com.auribises.model;

public class Phone extends Product{

	Integer screenSize;
	Integer ram;
	Integer memory;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	Phone(Integer screenSize, Integer ram, Integer memory) {
		this.screenSize = screenSize;
		this.ram = ram;
		this.memory = memory;
	}

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Phone [screenSize=" + screenSize + ", ram=" + ram + ", memory=" + memory + ", pid=" + pid + ", name="
				+ name + ", price=" + price + "]";
	}
	
}
