package com.meituan.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/index")
	public String showIndex() {
		return "index";
	}
	@RequestMapping("/register")
	public String showRegister() {
		return "register";
	}
	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	@RequestMapping("/picture")
	public String showPicture() {
		return "picture";
	}
}
