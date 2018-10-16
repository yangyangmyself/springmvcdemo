package com.java.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(path="/add")
	public ModelAndView addUser(HttpServletRequest request){
		
		return null;
	}
	
	@RequestMapping(path="/query")
	public ModelAndView queryUser(HttpServletRequest request){
		
		return null;
	}
	
	@RequestMapping(path="/query/all")
	public ModelAndView queryUsers(HttpServletRequest request){
		
		return null;
	}
}
