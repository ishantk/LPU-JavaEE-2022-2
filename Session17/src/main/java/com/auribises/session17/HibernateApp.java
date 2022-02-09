package com.auribises.session17;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.auribises.model.Dish;

public class HibernateApp {

	public static void main(String[] args) {
		
		/*
		 	Hibernate Procedure:
		 	1. Configure hibernate dependencies: update pom.xml file
		 	2. Create a Model with getters and setters
		 	3. Configure hibernate in the project using hibernate.cfg.xml file
		 	 	you can download the file from official hibernate site and then copy it [Reference Link: https://docs.jboss.org/hibernate/orm/5.6/quickstart/html_single/]
		 	 	
		 	4. For Hibernate, we need to use ORM i.e. Object Relational Mapping
		 	 	copy hbm.xml file to source directory and map java class with sql table
		 	5. Use Hibernate APIs and perform CRUD operations in the main file :) 	
		 */

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
			
			Dish dish1 = new Dish(0, "Burger", 80);
			Dish dish2 = new Dish(0, "Pizza", 350);
			Dish dish3 = new Dish(0, "Samosa", 20);
			
			// save method will automatically insert the Dish Object in Database
			session.save(dish1);
			session.save(dish2);
			session.save(dish3);
			
			transaction.commit();
			System.out.println("Transaction Committed by hibernate :)");
			session.close();
			sessionFactory.close();
			
		} catch (Exception e) {
			System.err.println("Exception is: "+e);
		}
	}

}
