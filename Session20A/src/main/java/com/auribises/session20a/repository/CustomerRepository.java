package com.auribises.session20a.repository;

import org.springframework.data.repository.CrudRepository;

import com.auribises.session20a.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	// CustomerRepository can now be used to perform CRUD Operations on Customer
}
