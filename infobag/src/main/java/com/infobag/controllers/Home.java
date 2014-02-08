package com.infobag.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infobag.models.People;
import com.infobag.services.Registry;

@Controller
public class Home {
	
	@RequestMapping("/hello")
	public ModelAndView getMessage() {
		
		People people = new People();
		people.setName("name13");
		people.setAge(2);
		
		
		Registry.getPeopleService().getAll();
		return new ModelAndView("hello", "message", "hi");
	}

}
