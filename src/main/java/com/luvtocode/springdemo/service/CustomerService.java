package com.luvtocode.springdemo.service;

import java.util.List;

import com.luvtocode.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	

	public Customer addCustomer(Customer customer);


	public Customer getCustomer(int id);


	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(Customer customer);
}
