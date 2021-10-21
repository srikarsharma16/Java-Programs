package com.srikar.SpringBoot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srikar.SpringBoot1.CustomerService.CustomerService;
import com.srikar.SpringBoot1.CustomerService.ProductService;
import com.srikar.SpringBoot1.model.Customer;
import com.srikar.SpringBoot1.model.Login;
import com.srikar.SpringBoot1.model.Product;

@Controller
public class HomeController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/test")
	public ModelAndView getHomePage() {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		modelAndView.addObject("ABC","BootCamp");
		return modelAndView;
	}
	
	@GetMapping("/dashboard")
	public ModelAndView getDashboardPage() {
		
		ModelAndView modelAndView = new ModelAndView("dashboard");
		System.out.println("Entering here");
		List<Product> allProducts= productService.getAllProducts();
		System.out.println(allProducts);
		modelAndView.addObject("allProducts",allProducts);
		
		return modelAndView;
	}
	
	@GetMapping("/login")
	public ModelAndView getLoginPage() {
		
		ModelAndView modelAndView = new ModelAndView("login");
		
		modelAndView.addObject("ABC","BootCamp");
		return modelAndView;
	}
	
	@PostMapping("/login")
	public String doLogin(Login login) {
		
		boolean isLogin = customerService.validate(login);
		
		if(isLogin) {
			return "redirect:/dashboard";
		} else {
			return "redirect:/login";
		}
	}
	@GetMapping("/register")
	public ModelAndView getRegisterPage() {
		
		ModelAndView modelAndView = new ModelAndView("register");
		
		
		return modelAndView;
	}
	
	@PostMapping("/register")
	public String doRegistration(Customer customer) {
		
			customerService.add(customer);
		    
			return "redirect:/login";
			
	}
	
	@PostMapping("/addProduct")
	public String AddProduct(Product product) {
		
			//ModelAndView modelAndView = new ModelAndView("addProduct");
			
			productService.add(product);
		
		
			return "redirect:/dashboard";
	}
	
	@GetMapping("/addProduct")
	public ModelAndView getAddProductPage() {
		
			ModelAndView modelAndView = new ModelAndView("addProduct");
		
		
			return modelAndView;
	}
	
	@GetMapping("/editProduct/{id}")
	public ModelAndView getEditProductPage(@PathVariable long id) {
		
			ModelAndView modelAndView = new ModelAndView("editProduct");
		    
			Product product = productService.getProductById(id);
			
			modelAndView.addObject("product",product);
			
			return modelAndView;
	}
	
	@PostMapping("/editProduct")
	public String editProductPage(Product product) {
		
		    
			productService.edit(product);

			return "redirect:/dashboard";
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable long id) {
		
	    
		productService.deleteProductById(id);

		return "redirect:/dashboard";
}

}
