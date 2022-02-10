package com.auribises.session18;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.auribises.model.Dish;
import com.auribises.model.Restaurant;

public class OneToManyApp {

	public static void main(String[] args) {
		
		/*Dish dish1 = new Dish(null, "Noodles", 150);
		Dish dish2 = new Dish(null, "Coffee", 80);
		Dish dish3 = new Dish(null, "Pizza", 250);
		Dish dish4 = new Dish(null, "Tea", 20);
		
		List<Dish> dishes = new ArrayList<Dish>();
		dishes.add(dish1); // 0
		dishes.add(dish2); // 1
		dishes.add(dish3); // 2
		dishes.add(dish4); // 3
		
		Restaurant restaurant = new Restaurant();
		restaurant.setName("Fionnas Chai Pani");
		restaurant.setPhone("+91 99999 22222");
		restaurant.setOperatingHours("10:00 to 22:00");
		restaurant.setPricePerPerson(100);
		
		// 1 to many relationship fulfillment
		restaurant.setDishes(dishes);*/
		
		
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
			
			//session.save(restaurant);
			
			Restaurant restaurant1 = session.get(Restaurant.class, 1);
			Restaurant restaurant2 = session.get(Restaurant.class, 2);
			
			System.out.println(restaurant1);
			System.out.println(restaurant2);
			
			// Next Time Hibernate will not contact database and will not execute select commands for the same data
			// 1st Level Cache -> Maintained by Session Object
			// 2nd Level Cache -> Maintained by SessionFactory Object
			// 3rd Level Cache -> Configured by develoeper :)
			Restaurant restaurant3 = session.get(Restaurant.class, 1);
			Restaurant restaurant4 = session.get(Restaurant.class, 2);
			
			System.out.println(restaurant3);
			System.out.println(restaurant4);
			
			transaction.commit();
			System.out.println("Transaction Committed by hibernate :)");
			session.close();
			sessionFactory.close();
			
		} catch (Exception e) {
			System.err.println("Exception is: "+e);
		}
	
	}

}
