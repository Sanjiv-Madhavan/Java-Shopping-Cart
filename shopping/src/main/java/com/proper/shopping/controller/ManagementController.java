package com.proper.shopping.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.proper.shoppingbackend.dao.CategoryDAO;
import com.proper.shoppingbackend.dao.ProductDAO;
import com.proper.shoppingbackend.dto.Category;
import com.proper.shoppingbackend.dto.Product;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView showmanageProducts(@RequestParam(value = "operation", required = false) String operation)
	{
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickManageProducts", true);
		mv.addObject("title", "Manage Products");
		
		Product nProduct = new Product();
		nProduct.setSupplierId(2);
		nProduct.setActive(true);
		
		mv.addObject("Product", nProduct);
		
		if(operation != null)
		{
			if(operation.equals("addProduct"))
			{
				mv.addObject("message", "Product added successfully");
			}
		}
		
		return mv;
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public String handleProductSubmission(@ModelAttribute("Product") Product mProduct)
	{
		
		logger.info(mProduct.toString());
		productDAO.add(mProduct);
		
		
		return "redirect:/manage/products?operation=addProduct";
	}
	
	@ModelAttribute("categories")
	public List<Category> getCategories()
	{
		return categoryDAO.list();
	}
	
}
