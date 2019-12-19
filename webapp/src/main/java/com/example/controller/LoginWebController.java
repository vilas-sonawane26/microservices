package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginWebController {
	private static final Logger logger = LoggerFactory.getLogger(LoginWebController.class);
	
	@GetMapping("/login")
	public String showLoginPage(Model model) {
		model.addAttribute("loginPageHeader", "Login Page");
		return "login";
	}
	
	@PostMapping("/login")
	public String submitLoginPage(@RequestParam("name") String name, @RequestParam("password") String password) {
		logger.info("name > "+ name);
		logger.info("password > "+ password);
		return "welcome";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "WLCOME TO JAVA WORLD!!";
	}
	
	@GetMapping("/register")
	public String showRegistarionForm(Model model) {
		model.addAttribute("registerPageHeader", "Registration Form");
		return "register";
	}

}
