package com.answer1991.account.dao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.answer1991.account.dao.UserDao;
import com.answer1991.account.dao.service.UserService;
import com.answer1991.account.dao.service.pojo.InputUserInfo;
import com.answer1991.account.entity.User;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public User register(InputUserInfo inputUserInfo) {
		User user = new User();
		user.seteMail(inputUserInfo.geteMail());
		user.setUsername(inputUserInfo.getUsername());
		user.setPassword(inputUserInfo.getPassword());
		
		userDao.persist(user);
		
		return user;
	}
	
	@Override
	public User findByEmail(String email) {
		return userDao.findUserByEmail(email);
	}
}
