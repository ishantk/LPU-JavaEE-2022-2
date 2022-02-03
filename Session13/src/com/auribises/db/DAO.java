package com.auribises.db;

import java.util.List;

// Generics in Java
// T can be any name of your choice
public interface DAO<T> {

	int insert(T object);
	int update(T object);
	int delete(int id);
	List<T> query();
	
}

// DAO interface contains RULES which must be implemented by the class which will perform DB operations
