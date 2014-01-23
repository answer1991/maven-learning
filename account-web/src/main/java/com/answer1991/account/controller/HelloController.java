package com.answer1991.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.answer1991.account.Hello;

@Controller
public class HelloController {
	public final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private Hello hello;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String handle() {
		logger.debug("one visit on /hello");
		System.out.println("hello");
		return hello.getMsg();
	}
}
