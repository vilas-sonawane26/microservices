package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
/*import org.springframework.security.web.firewall.DefaultHttpFirewall;
import org.springframework.security.web.firewall.HttpFirewall;*/

import com.example.config.MvcConfiguration;
/*import com.example.config.SecurityConfig;*/
import com.example.config.SecurityConfig;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.example.feign"})
@Import({MvcConfiguration.class,SecurityConfig.class})
@ComponentScan("com.example")
public class WebappApplication extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder builder) {
        return builder.sources(WebappApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}
	
	
	/*@Bean
	public HttpFirewall defaultHttpFirewall() {
	    return new DefaultHttpFirewall();
	}*/

}
