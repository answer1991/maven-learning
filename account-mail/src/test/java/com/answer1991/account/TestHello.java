package com.answer1991.account;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = {"hello"})
public class TestHello {
	private Hello hello;
	
	@BeforeMethod
	public void init() {
		this.hello = new Hello();	
	}
	
	@Test
	public void testGetMsg() {
		String result = this.hello.getMsg();
		Assert.assertEquals(result, "1234");
	}
}
