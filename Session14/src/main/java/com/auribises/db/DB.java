package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
	
	private Connection connection;
	Statement statement;
	
	// Object of DB inside the class and marked the reference variable as static
	private static DB db = new DB();

	// Create constructor as a private one :)
	// Limiting DB not to have objects outside
	private DB() {
	
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
	
	// Singleton Design Pattern :)
	public static DB getDB() {
		return db;// we will always give the reference of the same DB Object anytime getDB will be executed
	}
	
	// WRITE OPERATION
	public int executeUpdate(String sql) {
		
		int result = 0;
		
		try {
			// executeUpdate -> on statement will be used to execute insert, update and delete SQL Commands
			result = statement.executeUpdate(sql);
			System.out.println("[DB] Statement Executed");
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
		return result;
	}
	
	// READ OPERATION ON DB
	public ResultSet executeQuery(String sql) {
		
		//ResultSet is a data structure which contains rows fetched from table :)
		ResultSet set = null;
		
		try {
			// executeQuery -> on statement will be used to execute select SQL Commands
			set = statement.executeQuery(sql);
			System.out.println("[DB] Statement Executed");
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
		return set;
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
