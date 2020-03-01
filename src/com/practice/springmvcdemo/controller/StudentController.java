package com.practice.springmvcdemo.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.springmvcdemo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countries}")
	private Map<String, String> countriesMap;
	
	@Value("#{languages}")
	private Map<String, String> languagesList;
	
	@Value("#{osList}")
	private Map<String, String> osList;
	
	@RequestMapping("/showForm")
	public String showForm (Model theModel) {
		Student student = new Student();
		theModel.addAttribute("student", student); 
		theModel.addAttribute("countries", countriesMap);
		theModel.addAttribute("languages", languagesList);
		theModel.addAttribute("osList", osList);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm (@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResults) {
		if(bindingResults.hasErrors())
			return "student-form";
		return "student-confirmation";
	}
}
