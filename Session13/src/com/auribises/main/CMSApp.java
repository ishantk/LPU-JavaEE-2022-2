package com.auribises.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.auribises.db.CustomerDAO;
import com.auribises.db.DAO;
import com.auribises.model.Customer;

public class CMSApp {
	
	DAO<Customer> dao;

	public CMSApp() {
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to CMS App");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println();
		dao = new CustomerDAO(); // Polymorphic Statement
	}
	
	void runApp() {
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		do {
		
			System.out.println("Select a Choice: ");
			System.out.println("1. Register New Customer");
			System.out.println("2. Update Customer");
			System.out.println("3. Delete Customer");
			System.out.println("4. Fetch All Customers");
			System.out.println("5. Exit");
			System.out.println();
			System.out.println("Enter Your Choice:");
			choice = scanner.nextInt();
			System.out.println();
			
			if(choice == 1) {
				
				Customer customer = new Customer(); // Create a Customer Object with default data
				customer.inputCustomerDetails(); 	// Read Data from User into Customer Object
				int result = dao.insert(customer);
				String message = result>0 ? customer.name+" Registered Successfully" : customer.name+" Registration Failed";
				System.out.println(message);
				
			}else if(choice == 2) {
				
				System.out.println("Enter Customer ID You wish to Update: ");
				int cid = scanner.nextInt();
				
				Customer customer = new Customer();
				customer.inputCustomerDetails();
				customer.cid = cid; // set the cid in the object we wish to update in DB 
				
				int result = dao.update(customer);
				String message = result>0 ? customer.name+" Updated Successfully" : customer.name+" Updation Failed";
				System.out.println(message);
				
			}else if(choice == 3) {
				
				System.out.println("Enter Customer ID You wish to Delete: ");
				int cid = scanner.nextInt();
				int result = dao.delete(cid);
				
				String message = result>0 ? "Customer with ID "+cid+" Deleted Successfully" : cid+" Deletion Failed";
				System.out.println(message);
				
			}else if(choice == 4) {
				
				List<Customer> customers = dao.query();
				
				Comparator<Customer> comparator1 = new Comparator<Customer>() {
					
					@Override
					public int compare(Customer o1, Customer o2) {
						return o1.name.compareToIgnoreCase(o2.name);
					}
				
				};
				
				Comparator<Customer> comparator2 = (o1, o2) -> o1.rewardPoints-o2.rewardPoints;
				
				//Collections.sort(customers, comparator1);
				//Collections.sort(customers, comparator2);
				Collections.sort(customers, (o1, o2) -> o2.rewardPoints-o1.rewardPoints);
				
				customers.forEach((customer)->customer.showCustomer());
				
			}else if(choice == 5) {
				System.out.println("Thank You for Using CMS App");
				break;
			}else {
				System.out.println("Invalid Choice");
			}
			
		}while(true);
		
	}
	
	public static void main(String[] args) {
		
		CMSApp app = new CMSApp();
		app.runApp();

	}

}
