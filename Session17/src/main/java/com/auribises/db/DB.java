package com.auribises.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.auribises.model.Dish;

public class DB {
	
	public DB() {
		System.out.println("[DB] Object Created");
	}

	// will be injected using setter injection with DriverManagerDataSourc
	DataSource dataSource;
	
	// API JdbcTemplate will be used to perform CRUD Operations
	JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		System.out.println("[DB] SETTER INJECTION FOR DataSource");
		this.dataSource = dataSource;
		
		// Create the Object of JdbcTemplate by passing dataSource as input
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("[DB] JDBC Template Object Created");
	}
	
	public void insertDish(Dish dish) {
		String sql = "insert into Dish values(null, ?, ?)";
		
		// update method -> insert update and delete
		int result = jdbcTemplate.update(sql, dish.name, dish.price);
		if(result>0)
			System.out.println(dish.name+" inserted in Table");
	}
	
	// Assignment: Update and Delete on Dish using the same method jdbcTemplate.update :)
	
	public void fetchDishes() {
		String sql = "select * from Dish";
		List<Dish> dishes = jdbcTemplate.query(sql, new DishMapper());
		dishes.forEach((dish)->System.out.println(dish));
	}
	
	// Assignment:Explore queryForObject method -> i.e. when you will need to have a single object returned by SQL Statement
	
	
	
}
