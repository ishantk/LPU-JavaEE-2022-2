package com.auribises.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 	
 	SQL Commands and follwing the ORM
 	ORM: Object Relational Mapping
 	
 	Java: create class
 	class Customer {
		 int cid;
		 String name;
		 String phone;
		 String email;
		 int rewardPoints;
		 String registeredOn;
	}
	
	SQL: create table
	create table Customer(
		cid int primary key auto_increment,
		name varchar(256),
		phone varchar(256),
		email varchar(256),
		rewardPoints int,
		registeredOn date
	);
	
	Java: Create Customer Object
	Customer customer = new Customer(0, "John", "+91 99999 11111", "john@example.com", 100, "2022-02-02");
 	
 	SQL: create row/record
 	insert into Customer value (null, 'John', '+91 99999 11111', 'john@example.com', 100, '2022-02-02');
 */

public class Customer {

	public int cid;
	public String name;
	public String phone;
	public String email;
	public int rewardPoints;
	public String registeredOn;
	
	public Customer() {
		
		cid = 0;
		rewardPoints = 100;
		
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
		
		scanner.close();
		System.out.println("Customer Data Entered Successfully :) ");
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
