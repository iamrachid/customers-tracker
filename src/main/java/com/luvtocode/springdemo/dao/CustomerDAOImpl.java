package com.luvtocode.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luvtocode.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> query = currentSession.createQuery("from Customer order by lastName", Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(customer);	
		return null;
	}

	@Override
	public Customer getCustomer(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer customer = currentSession.get(Customer.class,id);
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.update(customer);	
	}

	
	public void deleteCustomer(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.delete(customer);
	}
	
}
