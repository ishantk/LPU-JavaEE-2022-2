package com.auribises.session18;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.auribises.model.Phone;
import com.auribises.model.Product;
import com.auribises.model.SmartPhone;

public class InheritanceApp {

	public static void main(String[] args) {
		
		// Product is Parent
		Product product = new Product();
		product.setName("Adidas Ultraboost Shoe");
		product.setPrice(8000);
		
		// Phone is Child of Product
		Phone phone = new Phone();
		phone.setName("Samsung F12");
		phone.setPrice(2000);
		phone.setRam(256);
		phone.setMemory(1024);
		phone.setScreenSize(3);
		
		// SmartPhone is child of Phone and GandChild of Product
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.setName("iPhone 11 Pro");
		smartPhone.setPrice(70000);
		smartPhone.setRam(8);
		smartPhone.setMemory(256);
		smartPhone.setScreenSize(6);
		smartPhone.setOs("iOS");
		smartPhone.setFeatures("FaceID, DoubleTapToScrrenShot etc..");
		
		System.out.println("product is:");
		System.out.println(product);
		System.out.println();
		
		System.out.println("phone is:");
		System.out.println(phone);
		System.out.println();
		
		System.out.println("smartPhone is:");
		System.out.println(smartPhone);
		System.out.println();
		
		// We will save all the three objects in the same table
		// i.e. we will create 1 table per hierarchy
		
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

			session.save(product);
			session.save(phone);
			session.save(smartPhone);
			
			transaction.commit();
			System.out.println("Transaction Committed by hibernate :)");
			session.close();
			sessionFactory.close();
			
		} catch (Exception e) {
			System.err.println("Exception is: "+e);
		}
	}

}

// Assignment: Work on other CRUD Operations alongwith Annotations for 1 to many and inheritance mappings
