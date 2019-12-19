package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registrationService")
public class RegistrationController {
	
	@Autowired
	public RegistartionDAO registartionDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@PostMapping(value="/addNewRegistration", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void saveNewUserRegistration(@RequestBody UserRegisterModel userRegisterModel) {
		
		logger.info("First Name >" + userRegisterModel.getFname()) ;
		logger.info("Last Name >" + userRegisterModel.getLname()) ;
		logger.info("User Name >" + userRegisterModel.getUsername()) ;
		logger.info("Password >" + userRegisterModel.getPassword()) ;
		
		logger.info("SAVE THIS VALUES USING JPA REPOSITORY");
		
		User user = new User();
		user.setFirstName(userRegisterModel.getFname());
		user.setLastName(userRegisterModel.getLname());
		user.setUsername(userRegisterModel.getUsername());
		user.setPassword(userRegisterModel.getPassword());
		user = registartionDAO.saveNewUser(user);
		
		//user = registartionDAO.getUser((long)2);
		
		logger.info("First Name >" + user.getFirstName()) ;
		logger.info("Last Name >" + user.getLastName()) ;
		logger.info("User Name >" + user.getUsername()) ;
		logger.info("Password >" + user.getPassword()) ;
	}
	
	@GetMapping("/hello")
	public String getMessage()
	{
		return "Test world";
	}

}
