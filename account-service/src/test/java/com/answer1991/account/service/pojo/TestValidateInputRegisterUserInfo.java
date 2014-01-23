package com.answer1991.account.service.pojo;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
@ContextConfiguration({"classpath:service-beans.xml"})
public class TestValidateInputRegisterUserInfo extends AbstractTestNGSpringContextTests {
	@Autowired
	private ValidatorFactory validatorFactory;
	
	private Validator validator;
	
	private final Logger logger = LoggerFactory.getLogger(TestValidateInputRegisterUserInfo.class);
	
	@BeforeMethod
	public void rebuildValidator() {
		validator = validatorFactory.getValidator();
	}
	
	@Test
	public void testFactoryNotNull() {
		Assert.assertNotNull(validatorFactory);
	}
	
	@Test
	public void testValidateInputRegisterUserInfo() {
		InputRegisterUserInfo user = new InputRegisterUserInfo();
		user.seteMail("1@q.xm");
		
		Set<ConstraintViolation<InputRegisterUserInfo>> constraint = validator.validate(user);
		Assert.assertEquals(0, constraint.size());
		
		logger.info("testValidateInputRegisterUserInfo method passed");
	}
}
