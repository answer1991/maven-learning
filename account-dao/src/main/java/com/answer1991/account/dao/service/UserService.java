package com.answer1991.account.dao.service;

import org.springframework.transaction.annotation.Transactional;

import com.answer1991.account.dao.service.pojo.InputUserInfo;
import com.answer1991.account.entity.User;

@Transactional
public interface UserService {
	public abstract User register(InputUserInfo inputUserInfo);
	public abstract User findByEmail(String email);
}
