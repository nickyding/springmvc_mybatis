package com.dy.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dy.baseTest.SpringTestCase;
import com.dy.domain.User;

public class UserServiceTest extends SpringTestCase {
	@Autowired  
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserByIdTest() {
		User user = userService.selectUserById(1);
		System.out.println(user);
		logger.debug("result:" + user);
	}
}
