package com.answer1991.account.dao;

import java.io.Serializable;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.answer1991.account.entity.User;

@Test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:hibernate-beans.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class TestUserDao extends AbstractTestNGSpringContextTests {
	@Autowired
	private UserDao userDao;
	
	private User user = null;
	
	@BeforeMethod
	public void init() {
		this.user = null;

		user = new User();
		user.seteMail("dddddxdd");
		user.setUsername("xxxxxxxxx");
		user.setPassword("1234556788");
		userDao.persist(user);
	}
	
	@BeforeTransaction
	public void beforeTx() {
	}
	
	@Test
	public void testInsert() {
		Assert.assertNotNull(this.user);
		//Assert.assertNotNull(this.user.getId());
	}
	
	@AfterTransaction
	public void afterTx() {
	}
	
	/*
	@Test
	public void testFind() {
		User user = new User();
		user.seteMail("dddddxdddd");
		user.setUsername("xxxxxxxxx");
		user.setPassword("1234556788");
		userDao.persist(user);
		
		Serializable id = user.getId();
		User findedUser = userDao.find(id);
		
		Assert.assertEquals(findedUser.geteMail(), user.geteMail());
	}
	*/
	/*
	public void testMerge() {
		User user = new User();
		user.seteMail("dddddxdd12");
		user.setUsername("xxxxxxxxx");
		user.setPassword("1234556788");
		userDao.persist(user);
		
		user.setUsername("hello world");
		userDao.merge(user);
		
		Assert.assertEquals(user.getUsername(), "hello world");
	}
	*/
	
}

