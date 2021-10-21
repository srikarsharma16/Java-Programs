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
		product2.setCategory("Furniture");
		product2.setId(2);
		product2.setName("Dining Table");
		product2.setPrice(23000);
		
		Product product3= new Product();
		product3.setCategory("Shoes");
		product3.setId(3);
		product3.setName("Puma");
		product3.setPrice(5000);
	
		//System.out.println("About To Enter");
		
		allProducts.add(product1);
		allProducts.add(product2);
		allProducts.add(product3);
		
		//System.out.println("After Entering");
		
	}
	
	public void add(Product product) {
		
		product.setId(allProducts.size()+1);
		allProducts.add(product);
	}
	
	public List<Product> getAllProducts() {
		return allProducts;
	}

	public Product getProductById(long id) {
		for (Product productDB : allProducts) {
			if(productDB.getId() == id) {
				return productDB;
			}
		}
		return null;
	}

	public void edit(Product product) {
		long id = product.getId();
		
		Product productDB = getProductById(id);
		
		if(productDB != null) {
			
			productDB.setName(product.getName());
			productDB.setCategory(product.getCategory());
			productDB.setPrice(product.getPrice());
		}
		
	}
	
	public void deleteProductById(long id) {
		 
        Product tobeDeleted = null;
 
        for (Product productDB : allProducts) {
 
            if (productDB.getId() == id) {
 
                tobeDeleted = productDB;
 
                break;
 
            }
        }
 
        allProducts.remove(tobeDeleted);
 
    }
	

}
