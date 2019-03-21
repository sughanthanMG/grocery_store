package com.grocery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grocery.model.Signup;
import com.grocery.service.Groceryservice;



@Controller
public class MainController {
	
	@RequestMapping("/")
	public String Login(Model theModel) {
		Signup signup=new Signup();
		theModel.addAttribute("signup",signup);
		return "index";
	}
	
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("details") Signup signup) {
		Groceryservice.addData(signup);
		return "login";
	}
	@RequestMapping("/login")
	public String register(@ModelAttribute("details") Model theModel) {
		Groceryservice.login(theModel);
		return "login";
	}

}