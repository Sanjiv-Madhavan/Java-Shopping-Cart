package com.proper.shopping.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultHandlerException {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle", "Page couldn't be constructed");
		mv.addObject("errorDescription", "Looking page is not found!");
		mv.addObject("title", "404 error page");
		return mv;
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle", "Product not found");
		mv.addObject("errorDescription", "Looking Product is not found!");
		mv.addObject("title", "Product Unavailable");
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception e) {
		
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle", "Contact Admin!");	
				
		//Debug
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		e.printStackTrace(pw);
		mv.addObject("errorDescription", sw.toString());
		mv.addObject("title", "Error");
		return mv;
	
}
}