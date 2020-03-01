package com.practice.springmvcdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.springmvcdemo.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController { 
	
	@RequestMapping("/showForm")
	public String showForm (Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer", customer); 
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm (@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResults) {
		System.out.println("Binding results : "+bindingResults);
		if(bindingResults.hasErrors())
			return "customer-form";
		return "customer-confirmation";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}
