package com.proper.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proper.shoppingbackend.dao.CategoryDAO;
import com.proper.shoppingbackend.dto.Category;



@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("These are TVs");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("These are Mobiles");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("These are Laptops");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		
	}
	
	
	@Override
	public List<Category> list() {
		//System.out.println(categories);
		// TODO Auto-generated method stub
		return categories;
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories)
		{
			if(category.getId() == id)
				return category;
		}
		return null;
	}


	@Override
	@Transactional
	public boolean add(Category category) {
		
		try
		{
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

}
