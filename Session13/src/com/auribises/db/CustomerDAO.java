package com.auribises.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.auribises.model.Customer;

public class CustomerDAO implements DAO<Customer>{

	// Obtain the reference of DB Object by executing getDB method
	DB db = DB.getDB();
	
	@Override
	public int insert(Customer object) {
		int result = 0;
		
		String sql = "insert into Customer values(null, ?, ?, ?, ?, ?)";
		// ? is a wild car character which will have the value substituted
		try {
			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			statement.setString(1, object.name);
			statement.setString(2, object.phone);
			statement.setString(3, object.email);
			statement.setInt(4, object.rewardPoints);
			statement.setString(5, object.registeredOn);
			
			result = db.executeUpdate(statement);
			
		}catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
		return result;
	}

	@Override
	public int update(Customer object) {
		int result = 0;
		
		String sql = "update Customer set name=?, phone=?, email=?, rewardPoints=? where cid=?";
		// ? is a wild car character which will have the value substituted
		try {
			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			statement.setString(1, object.name);
			statement.setString(2, object.phone);
			statement.setString(3, object.email);
			statement.setInt(4, object.rewardPoints);
			statement.setInt(5, object.cid);
			
			result = db.executeUpdate(statement);
			
		}catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
		return result;
	}

	@Override
	public int delete(int id) {
		int result = 0;
		
		String sql = "delete from Customer where cid=?";
		// ? is a wild car character which will have the value substituted
		try {
			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			statement.setInt(1, id);
			
			result = db.executeUpdate(statement);
			
		}catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
		
		return result;
	}

	@Override
	public List<Customer> query() {
		
		// ArrayList will represent the rows of Table as Customer Objects :)
		List<Customer> customers = new ArrayList<Customer>();
		
		String sql = "select * from Customer";
		
		try {
			PreparedStatement statement = db.getConnection().prepareStatement(sql);
			ResultSet set =  db.executeQuery(statement);
			
			if(set!=null) {
				
				while(set.next()) { // next method will return true untill we have next row available in ResultSet
					
					Customer customer = new Customer();
					customer.cid = set.getInt(1); // column number
					customer.name = set.getString(2); // column number
					customer.phone = set.getString("phone"); // column name
					customer.email = set.getString("email"); // column name
					customer.rewardPoints = set.getInt("rewardPoints"); // column name
					customer.registeredOn = set.getString("registeredOn"); // column name
					
					customers.add(customer);
				}
				
			}else {
				System.err.println("NO DATA FOUND IN TABLE");
			}
			
		}catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
		return customers;
	}

}
