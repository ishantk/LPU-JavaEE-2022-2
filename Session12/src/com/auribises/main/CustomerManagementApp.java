package com.auribises.main;

import com.auribises.controller.DB;
import com.auribises.model.Customer;

public class CustomerManagementApp {
	
	DB db;
	
	public CustomerManagementApp() {
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to CMS App");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		db = new DB();
	}
	
	void registerNewCustomer() {
		Customer customer = new Customer();
		customer.inputCustomerDetails();
		
		System.out.println("Please Review Customer Data: ");
		System.out.println(customer);
		
		String sql = customer.toSQL();
		int result = db.executeSQLStatement(sql);
		
		String message = result>0 ? customer.name+" Inserted Successfully" : customer.name+" Not Inserted";
		System.out.println(message);
	}

	void exitApp() {
		db.closeConnection();
		System.out.println("Thank You For Using CMS App :)");
	}
	
	public static void main(String[] args) {
		
		CustomerManagementApp app = new CustomerManagementApp();
		app.registerNewCustomer();
		app.exitApp();

	}

}
