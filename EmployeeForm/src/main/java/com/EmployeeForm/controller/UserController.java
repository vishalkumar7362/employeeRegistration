package com.EmployeeForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.EmployeeForm.entity.User;
import com.EmployeeForm.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	//http://localhost:8080/create
	@RequestMapping("/create")
	public String viewCreateRegPage() { 
		return "Registration";
		
	}
	
	//http://localhost:8080/saveUser
	@RequestMapping("/saveUser")
	public String saveOneUser(@ModelAttribute("user") User user) {
		userService.saveUserInfo(user);
		return "Registration";
	}

}
