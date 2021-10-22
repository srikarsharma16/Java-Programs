package com.srikar.SpringBoot1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.srikar.SpringBoot3.model.Product;

@Repository
public class ProductDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void add(Product product) {
		String insertSql = "insert into product(name,category,price) values(?,?,?)";
		
		jdbcTemplate.update(insertSql, product.getName(), product.getCategory(), product.getPrice());
	}
	
	public void update(Product product) {
		
		String updateSql = "update product set name=?, category=?, price=? where id=?";
		
		jdbcTemplate.update(updateSql, product.getName(), product.getCategory(), product.getPrice());
		
	}
	
	public void delete(long productId) {
		String deleteSql = "Delete from product where id=?";
		
		jdbcTemplate.update(deleteSql, productId);
	}

}
