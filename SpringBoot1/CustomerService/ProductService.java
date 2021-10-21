package com.srikar.SpringBoot1.CustomerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.srikar.SpringBoot1.model.Customer;
import com.srikar.SpringBoot1.model.Product;

@Service
public class ProductService {
	
	public List<Product> allProducts;
	
	public ProductService() {
		allProducts = new ArrayList<>();
		
		Product product1= new Product();
		product1.setCategory("Shoes");
		product1.setId(1);
		product1.setName("Bata");
		product1.setPrice(1000);
		
		Product product2= new Product();
		product2.setCategory("Shoes");
		product2.setId(2);
		product2.setName("Reboke");
		product2.setPrice(3000);
		
		Product product3= new Product();
		product3.setCategory("Shoes");
		product3.setId(3);
		product3.setName("Puma");
		product3.setPrice(5000);
	
		System.out.println("About To Enter");
		
		add(product1);
		add(product2);
		add(product3);
		
		System.out.println("After Entering");
		
	}
	
	public void add(Product product) {
		if(allProducts.add(product)) {
			System.out.println("added");
		}
	}
	
	public List<Product> getAllProducts() {
		return allProducts;
	}
	
	
	

}
