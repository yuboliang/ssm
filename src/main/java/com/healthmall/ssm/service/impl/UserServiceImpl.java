package com.healthmall.ssm.service.impl;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthmall.ssm.dao.UserDao;
import com.healthmall.ssm.entity.User;
import com.healthmall.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserByName(String username) {
		
		System.out.println();
		return userDao.getUserByName(username);
	}

}
