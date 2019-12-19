package com.example.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	
	@GetMapping("/hello")
	public ModelAndView getMessage()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","hii how are you");
		mv.setViewName("hello");
		return mv;
	}

}
