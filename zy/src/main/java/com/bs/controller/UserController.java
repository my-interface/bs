package com.bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	/***
	 * 登录方法
	 * @return
	 */
	@RequestMapping("login")
	public String login(){
		return "";
	}
}
