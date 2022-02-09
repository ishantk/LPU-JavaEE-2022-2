package com.auribises.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.auribises.model.Dish;

public class DishMapper implements RowMapper<Dish>{
	
	public Dish mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dish dish = new Dish();
		dish.dishId = rs.getInt(1);
		dish.name = rs.getString(2);
		dish.price = rs.getInt(3);
		return dish;
	}

}
