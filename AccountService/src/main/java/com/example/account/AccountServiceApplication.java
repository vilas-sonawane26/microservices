package com.example.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.client.RestTemplate;
import com.example.conditional.Person;
import com.example.conditional.PersonConditional;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class AccountServiceApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = SpringApplication.run(AccountServiceApplication.class, args);
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	@Conditional(PersonConditional.class)
	public Person person()
	{
		Person p = new Person();
		p.setName("vilas");
		p.setAge(35);
		return p;
	}
	


}

