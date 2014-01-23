package com.answer1991.account.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:hibernate-beans.xml")
public class TestTableGenerator extends AbstractTestNGSpringContextTests {
	@Autowired
	private ApplicationContext cxt;
	
	@PersistenceContext
	private EntityManager em;
	
	@Test
	public void test() {
		Assert.assertNotNull(cxt);
		Assert.assertNotNull(em);
	}
	
}
