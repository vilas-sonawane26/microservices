package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.UserRegisterModel;

@FeignClient("edge-service") //@FeignClient("registration-service") 
public interface RegistrationClient {
	
	@PostMapping(value="/api/registration/registrationService/addNewRegistration", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void saveNewUserRegistration(@RequestBody UserRegisterModel userRegisterModel);

}
