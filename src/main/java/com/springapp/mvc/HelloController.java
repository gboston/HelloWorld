package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	private IAnimalStore store;

	@RequestMapping(method = RequestMethod.GET,value = "/{id}")
	public ModelAndView printWelcome(@PathVariable("id") String id) {
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("animals", Arrays.asList(new Animal(id),new Animal(id)));
		//model.add("animal", new Animal());
		return modelAndView;
	}
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String hi(){
		return "hello";
	}
}

