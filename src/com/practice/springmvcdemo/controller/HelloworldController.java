package com.practice.springmvcdemo.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class HelloworldController {
	
	@RequestMapping("/showForm")
	public String showForm1() {
		System.out.println("here in show form");
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion2")
	public String shoutOutDude1(HttpServletRequest request, Model model) {
		
		//read request parameter from html form
		String fn = request.getParameter("firstName");
		String ln = request.getParameter("lastName");
		
		//convert input to uppercase
		fn = fn.toUpperCase();
		ln = ln.toUpperCase();		
		
		//Add the result to attribute so that we can access it in jsp.
		model.addAttribute("message", "OH!! "+fn+" "+ln);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion3")
	public String shoutOutDude2(@RequestParam("firstName") String fn, @RequestParam("lastName") String ln, Model model) {
		
		//convert input to uppercase
		fn = fn.toUpperCase();
		ln = ln.toUpperCase();		
		
		//Add the result to attribute so that we can access it in jsp.
		model.addAttribute("message", "OH!! "+fn+" "+ln);
		
		return "helloworld";
	}

}
