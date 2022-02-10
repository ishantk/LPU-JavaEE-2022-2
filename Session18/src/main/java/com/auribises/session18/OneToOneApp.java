package com.auribises.session18;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.auribises.model.Address;
import com.auribises.model.Customer;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setName("John");
		customer.setPhone("+91 99999 11111");
		customer.setEmail("john@example.com");
		
		Address address = new Address();
		address.setAdrsLine("Redwood Shores");
		address.setCity("Ludhiana");
		address.setZipCode(141001);
		
		
		customer.setAddress(address);
		address.setCustomer(customer);

		System.out.println("CUSTOMER DETAILS: ");
		System.out.println(customer);
		
		// SessionFactory will create Session
		SessionFactory sessionFactory = null;
		// Session is connection to DB and using this API we perform CRUD operations
		Session session = null;
		//Transaction API executes the SQL Statements as a transaction means commit and rollback feature
		Transaction transaction = null;
		
		try {
			
			// Read the hibernate configuration xml file -> Parse the XML File :)
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			
			// build Session Factory
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			// Saving the Customer Object, Address Object associated with it, will be automatically saved :)
			session.save(customer);
			
			transaction.commit();
			System.out.println("Transaction Committed by hibernate :)");
			session.close();
			sessionFactory.close();
			
		} catch (Exception e) {
			System.err.println("Exception is: "+e);
		}
	}

}

// Assignment: 1. Perform other CRUD Operations
//			   2. Use Annotation to form 1 to 1 mapping rather than hbm file
