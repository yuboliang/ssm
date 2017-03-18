package com.healthmall.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.healthmall.ssm.entity.User;
import com.healthmall.ssm.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView userLogin()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/login");
		return modelAndView;
	}
	
	@RequestMapping("/userLogin")
	public ModelAndView login(User user, HttpServletRequest request)
	{
		String username = user.getUsername();
		User userInfo = userService.getUserByName(username);
		if(userInfo != null)
		{
			int id = userInfo.getId();
			System.out.println("-------------" + userInfo.getUsername());
			System.out.println("-------------" + userInfo.getPassword());
			request.getSession().setAttribute("userId", String.valueOf(id));
			ModelAndView modelAndView = new ModelAndView("redirect:/success");
			return modelAndView;
		}else
		{
			ModelAndView modelAndView = new ModelAndView("redirect:/login");
			return modelAndView;
		}
	}
}
