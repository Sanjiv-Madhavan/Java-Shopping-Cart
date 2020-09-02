package com.proper.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proper.shoppingbackend.dao.CategoryDAO;
import com.proper.shoppingbackend.dto.Category;

public class CategoryTest {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.proper.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
	}
	
	@Test
	public void testCategory()
	{
		category = new Category();
		category.setName("Lap");
		category.setDescription("PJ of laps");
		category.setImageURL("CAT_TEST.png");
		
		assertEquals("Successfully completed ", true, categoryDAO.add(category));
	}
	
	
}
