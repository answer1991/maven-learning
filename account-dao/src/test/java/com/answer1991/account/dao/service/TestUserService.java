package com.answer1991.account.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.answer1991.account.dao.service.pojo.InputUserInfo;
import com.answer1991.account.entity.User;

@Test
@ContextConfiguration("classpath:hibernate-beans.xml")
@TransactionConfiguration
public class TestUserService extends AbstractTestNGSpringContextTests {
	@Autowired
	private UserService userService;
	
	@Test
	public void testRegister() {
		InputUserInfo userInfo = new InputUserInfo();
		userInfo.seteMail("email1@qq.com");
		userInfo.setPassword("1234567890");
		userInfo.setUsername("username1");
		
		User user = userService.register(userInfo);
		Assert.assertNotNull(user.getId());
	}
	
	@Test
	public void testFindUserByEmail() {
		InputUserInfo userInfo = new InputUserInfo();
		userInfo.seteMail("email2@qq.com");
		userInfo.setPassword("1234567890");
		userInfo.setUsername("username2");
		
		User user = userService.register(userInfo);
		
		User user2 = userService.findByEmail("email2@qq.com");
		
		Assert.assertEquals(user2.geteMail(), user.geteMail());
		Assert.assertEquals(user2.getUsername(), user.getUsername());
		Assert.assertEquals(user2.getPassword(), user.getPassword());
		
	}
}
