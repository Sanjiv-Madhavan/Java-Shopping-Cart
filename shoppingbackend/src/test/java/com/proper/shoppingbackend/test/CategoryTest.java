package com.proper.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

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
	public void testAddCategory()
	{
//		category = new Category();
//		category.setName("Lap");
//		category.setDescription("PJ of laps");
//		category.setImageURL("CAT_TEST_1.png");
//		
//		assertEquals("Successfully completed ", true, categoryDAO.add(category));
//
//		
//		category = new Category();
//		category.setName("TV");
//		category.setDescription("PJ of TVs");
//		category.setImageURL("CAT_TEST_2.png");
//		
//		
//		assertEquals("Successfully completed ", true, categoryDAO.add(category));
//
//		category = new Category();
//		category.setName("Lap");
//		category.setDescription("PJ of laps");
//		category.setImageURL("CAT_TEST_3.png");
//		
//		assertEquals("Add completed ", true, categoryDAO.add(category));
		
//		category = categoryDAO.get(2);
//		
//		category.setName("Television");
//		
//		assertEquals("Update complete", true, categoryDAO.update(category));
//		
//		assertEquals("Delete complete", true, categoryDAO.delete(category));
//		
//		assertEquals("Listing", 2, categoryDAO.list().size());
		
	}
	
	
	
	
}
