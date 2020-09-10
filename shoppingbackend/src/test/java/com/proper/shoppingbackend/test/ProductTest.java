package com.proper.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proper.shoppingbackend.dao.ProductDAO;
import com.proper.shoppingbackend.dto.Product;

public class ProductTest {
	
	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.proper.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
//	@Test
//	public void testProducts()
//	{
//		product = new Product();
//		product.setName("Oppo 5s");
//		product.setBrand("Oppo");
//		product.setDescription("This is the greaatest oppo of all time");
//		product.setUnitPrice(14000);
//		product.setActive(true);
//		product.setCategoryId(3);
//		product.setSupplierId(3);
//		
//		assertEquals("Something went Wrong while adding product", true, productDAO.add(product));
//		
//		product = productDAO.get(2);
//		product.setName("Iphone 6");
//		assertEquals("Something went wrong while updating product", true, productDAO.update(product));
//		assertEquals("Something went wrong while deleting product", true, productDAO.delete(product));
//		assertEquals("Something went wrong while listing products", 5, productDAO.list().size());
//		
//	}
	
	@Test
	public void testListActiveProducts()
	{
		assertEquals("something wrong with listing active products!",
				4, productDAO.listActiveProducts().size());
	}

	@Test
	public void testListActiveProductsByCategory() {
		assertEquals("something wrong with listing actove by category", 
				3, productDAO.listActiveProductsByCategory(3).size());
		assertEquals("something wrong with listing actove by category", 
				1, productDAO.listActiveProductsByCategory(1).size());
	}
	
	@Test
	public void testListLatestActiveProducts() {
		assertEquals("something went wrong with listing latest active proucts", 
				3, productDAO.latestActiveProducts(3).size());
	}
	
}
