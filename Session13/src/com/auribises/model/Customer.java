package com.auribises.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer {

	public int cid;
	public String name;
	public String phone;
	public String email;
	public int rewardPoints;
	public String registeredOn;
	
	public Customer() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		registeredOn = formatter.format(date);
	}

	Customer(int cid, String name, String phone, String email, int rewardPoints, String registeredOn) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.rewardPoints = rewardPoints;
		this.registeredOn = registeredOn;
	}
	
	public void inputCustomerDetails() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		name = scanner.nextLine();
		
		System.out.println("Enter Customer Phone: ");
		phone = scanner.nextLine();
		
		System.out.println("Enter Customer Email: ");
		email = scanner.nextLine();
		
		System.out.println("Enter Customer RewardPoints: ");
		rewardPoints = scanner.nextInt();
		
		//scanner.close();
		System.out.println("Customer Data Entered Successfully :) ");
		System.out.println("Customer Details:");
		showCustomer();
	}
	
	public void showCustomer() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(cid+"\t"+name+"\t"+phone+"\t"+email+"\t"+rewardPoints+"\t"+registeredOn);
		System.out.println("---------------------------------------------------------------------------------------");
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", rewardPoints="
				+ rewardPoints + ", registeredOn=" + registeredOn + "]";
	}
	
	public String toSQL() {
		return "insert into Customer value (null, '"+name+"', '"+phone+"', '"+email+"', "+rewardPoints+", '"+registeredOn+"');";
	}
	
}
