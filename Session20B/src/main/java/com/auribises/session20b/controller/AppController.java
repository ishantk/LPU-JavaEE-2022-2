package com.auribises.session20b.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.auribises.session20b.model.Customer;
import com.auribises.session20b.repository.CustomerRepository;

@RestController
@RequestMapping(path = "/mongo-customer-api")
public class AppController {

	@Autowired
	CustomerRepository repository;
	
	@PostMapping(path= "/add")
	public ResponseEntity<Customer> addCustomer(@RequestParam String name, @RequestParam String email, @RequestParam String phone) {
		
		Customer customer = new Customer(null, name, email, phone);
		repository.save(customer);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		
	}
	
	@GetMapping(path="/customers")
	public ResponseEntity<ArrayList<Customer>> getCustomers(){
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		repository.findAll().forEach((customer) -> customers.add(customer));
		
		return new ResponseEntity<ArrayList<Customer>>(customers, HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/update/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") String id){
		
		Customer customer = new Customer(id, "John Jackson", "john.jackson@example.com", "9898090911");
		repository.save(customer);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/delete/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") String id){
		
		Customer customer = new Customer();
		customer.setId(id);
		repository.delete(customer);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		
	}
	
}
