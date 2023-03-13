package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	
	
	
	@RequestMapping("/aaa")
	public String aaa() {
		return "dinner 7:30";
	}
}