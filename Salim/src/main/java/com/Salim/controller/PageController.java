package com.Salim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController { 
	@RequestMapping (value= {"/","/home","/index"})
	
	public ModelAndView index()
	{
		ModelAndView obj=new ModelAndView("page");
		obj.addObject("Hello","This is frontend");
		return obj;
	}

}
