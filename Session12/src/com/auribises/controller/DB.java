package com.auribises.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 
 	MySQL Installation Link: https://dev.mysql.com/downloads/installer/
 	make Sure to remember your username and password
 	username is by default root and password is blank
 	
 	mysql -u root -p
 	
 	JDBC Procedure
 	1. Load the Driver
 		1.1 Download the ConnectorJ jar file [ Link: https://dev.mysql.com/downloads/connector/j/ ]
 			from mvnrepository, Link: https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.28
 		1.2 Link the jar file in project by configuring the build path
 		1.3 Load the Driver class using Class.forname API
 	2. Create the Connection
 		we need: url to db, username and password
 		Use APIs Connection and DriverManager to create connection to database
 	3. Execute SQL Statement
 		Use API Statement or PreparedStatement
 	4. Close the Connection
 		Execute close method on Connection
 	
 */

public class DB {
	
	Connection connection;
	Statement statement;

	public DB() {
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("[DB] 1. Driver Loaded");
			
			String url = "jdbc:mysql://localhost/estoredb";
			String user = "root";
			String password = "";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("[DB] 2. Connection Created");
			
			statement = connection.createStatement();
			System.out.println("[DB] 3.1. Statement Created");
			
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
	}
	
	public int executeSQLStatement(String sql) {
		
		int result = 0;
		
		try {
			// executeUpdate -> on statement will be used to execute insert, update and delete SQL Commands
			result = statement.executeUpdate(sql);
			System.out.println("[DB] 3.2. Statement Executed");
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
		return result;
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("[DB] 4. Connection Closed");
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
}
