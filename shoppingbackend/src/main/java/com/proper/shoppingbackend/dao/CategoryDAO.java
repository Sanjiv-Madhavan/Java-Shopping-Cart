package com.proper.shoppingbackend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proper.shoppingbackend.dto.Category;


public interface CategoryDAO {

	boolean add(Category category);
	
	List<Category> list();
	
	Category get(int id);
	
	
}
