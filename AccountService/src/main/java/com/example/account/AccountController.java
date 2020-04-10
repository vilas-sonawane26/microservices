package com.example.account;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.conditional.Person;

/**
 * controller class for managing accoount (linux centos)
 * @author vsonawane
 *
 */
@RestController
public class AccountController {
	
	@Autowired
	@LoadBalanced
	RestTemplate restTemplate;
	
	@Autowired
	Person person;
	
	@Autowired
	JdbcTemplate template;
	
	
	@GetMapping("/test")
	public String getMessage()
	{
		
		String sql = "SELECT COUNT(*) FROM TEST";
		SqlRowSet tst = template.queryForRowSet(sql);
		
		String message = person.getName() + " >>>> " + person.getAge() + " >>"
				+ ""+restTemplate.getForObject("http://customer-service/message", String.class);
		return message;
	}

}
