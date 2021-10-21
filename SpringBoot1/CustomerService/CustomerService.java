package com.srikar.SpringBoot1.CustomerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.srikar.SpringBoot1.model.Customer;
import com.srikar.SpringBoot1.model.Login;

@Service
public class CustomerService {
	
	public List<Customer> allCustomers;
	
	
	public CustomerService() {
		allCustomers = new ArrayList<>();
		
		Customer customer1= new Customer();
		
		customer1.setEmail("abc@gmail.com");
		customer1.setPassword("abc1234");
		customer1.setName("ABC");
		customer1.setId(1);
		
		add(customer1);
	}
	
	
	public void add(Customer customer) {
		customer.setId(allCustomers.size()+1);
		allCustomers.add(customer);
	}
	
	public List<Customer> getAllCustomers() {
		return allCustomers;
	}
	


	public boolean validate(Login login) {
		String email= login.getEmail();
		String password = login.getPassword();
		for (Customer customer : allCustomers) {
			if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
		
	}
	

}
