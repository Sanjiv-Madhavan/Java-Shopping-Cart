package com.proper.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", " New MVC Page! ");
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
