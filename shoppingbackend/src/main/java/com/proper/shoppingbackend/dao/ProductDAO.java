package com.proper.shoppingbackend.dao;

import java.util.List;

import com.proper.shoppingbackend.dto.Product;

public interface ProductDAO {
	Product get(int productId);
	List<Product> list();
	
	boolean add(Product product);
	boolean delete(Product product);
	boolean update(Product product);
	
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> latestActiveProducts(int count);
}
