package com.luvtocode.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luvtocode.springdemo.entity.Customer;
import com.luvtocode.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String getCustomers(Model model) {
		
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers",customers);
		
		return "customer-list";
	}
	
	@GetMapping("/add")
	public String addCustomer(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-add";
	}
	
	@PostMapping("/list")
	public String getCustomers(@ModelAttribute("customer") Customer customer, Model model) {
		
		customerService.addCustomer(customer);

		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers",customers);
		
		return "customer-list";
	}
	
	@GetMapping("/update")
	public String updateCustomer(@RequestParam("id") int id, Model model) {
		Customer customer = customerService.getCustomer(id);
		model.addAttribute("customer",customer);
		return "customer-update";
	}
	
	@PostMapping("/updated")
	public String updatedCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.updateCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("id") int id) {
		Customer customer = customerService.getCustomer(id);
		customerService.deleteCustomer(customer);
		return "redirect:/customer/list";
	}
	
}
