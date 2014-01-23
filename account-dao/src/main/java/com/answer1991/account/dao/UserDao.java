package com.answer1991.account.dao;

import com.answer1991.account.entity.User;

public interface UserDao extends BaseDao<User> {
	public abstract User findUserByEmail(String email);
}
