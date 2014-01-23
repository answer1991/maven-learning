package com.answer1991.account.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.answer1991.account.dao.UserDao;
import com.answer1991.account.entity.User;

@Component
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	@Override
	public User findUserByEmail(String email) {
		Query query = em.createNamedQuery("User.findByEmail");
		query.setParameter("eMail", email);
		return (User)query.getSingleResult();
	}
}
