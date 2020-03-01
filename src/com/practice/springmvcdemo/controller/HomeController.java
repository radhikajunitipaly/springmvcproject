package com.practice.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMyPage() {
		System.out.println("Here");
		return "main-menu";
	}
}
