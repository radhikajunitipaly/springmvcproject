package com.practice.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class FunnyController {
	
	@RequestMapping("/")
	public String diplayForm() {
		return "main-menu";
	}

}
