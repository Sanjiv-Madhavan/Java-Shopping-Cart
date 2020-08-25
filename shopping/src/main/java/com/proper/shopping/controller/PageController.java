package com.proper.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.proper.shoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
//	@RequestMapping("/test")
//	public ModelAndView test(@RequestParam(value="greeting", required = false) String greeting) {
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	
//	@RequestMapping("/test/{greet}")
//	public ModelAndView test(@PathVariable("greet")String greeting) {
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
//	
}
