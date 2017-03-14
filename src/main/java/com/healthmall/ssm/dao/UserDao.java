package com.healthmall.ssm.dao;

import org.springframework.stereotype.Repository;

import com.healthmall.ssm.entity.User;

@Repository
public interface UserDao {
	public User getUserByName(String username);
}
