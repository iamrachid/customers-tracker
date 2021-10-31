package com.luvtocode.springdemo.dao;

import java.util.List;

import com.luvtocode.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public Customer addCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(Customer customer);
	
}
