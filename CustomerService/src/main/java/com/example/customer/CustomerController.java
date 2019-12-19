package com.example.customer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@GetMapping("/message")
	public String getMessage() {
		logger.trace("This is testing message");
		return "Hello world";
	}

}
