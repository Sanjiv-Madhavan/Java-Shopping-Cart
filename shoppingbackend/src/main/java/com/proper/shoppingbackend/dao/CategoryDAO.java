package com.proper.shoppingbackend.dao;

import java.util.List;

import com.proper.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	
	Category get(int id);
	
	
}
