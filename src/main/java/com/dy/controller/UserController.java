package com.dy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dy.domain.User;
import com.dy.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView getIndex() {
		ModelAndView mv = new ModelAndView("index");
		User user = userService.selectUserById(1);
		mv.addObject("user", user);
		return mv;
	}
}
