package com.healthmall.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.healthmall.ssm.entity.User;
import com.healthmall.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class loginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user, HttpServletRequest request)
	{
		String username = user.getUsername();
		User userInfo = userService.getUserByName(username);
		if(userInfo != null)
		{
			System.out.println("-------------" + userInfo.getUsername());
			System.out.println("-------------" + userInfo.getPassword());
			return "redirect:/success.jsp";
		}else
		{
			return "redirect:/index.jsp";
		}
	}
}
