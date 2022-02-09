package com.auribises.session17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.auribises.db.DB;
import com.auribises.model.Dish;

public class SpringJDBCApp {

	public static void main(String[] args) {
		
		/*
		 	
		 	Spring JDBC Procedure:
		 	1. Configure Dependencies i.e. Spring Core, Spring JDBC and MySQL Library
		 	2. Create the Model i.e. Object to Save
		 	3. Configure DriverManagerDataSource API in xml file
		 	4. Create a database class which will have setter injection for DataSource
		 	   Also internally create the object of JDBCTemplate class from Spring jdcb module
		 	5. Get the reference to the DB Object using IOC
		 	6. Perform CRUD Operations using JDBC Template API from Spring FW
		 	
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
		DB dbRef = context.getBean("db", DB.class);
		
//		Dish d1 = new Dish(0, "Noodles", 200);
//		Dish d2 = new Dish(0, "Burger", 50);
//		Dish d3 = new Dish(0, "Samosa", 20);
		
//		dbRef.insertDish(d1);
//		dbRef.insertDish(d2);
//		dbRef.insertDish(d3);
		
		dbRef.fetchDishes();

	}

}
