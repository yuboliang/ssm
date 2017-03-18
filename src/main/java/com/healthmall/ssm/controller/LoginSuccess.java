package com.healthmall.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginSuccess {
	
	@RequestMapping("/success")
	public String loginSuccess()
	{
		return "/success";
	}
}
