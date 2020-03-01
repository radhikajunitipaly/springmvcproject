package com.practice.springmvcdemo.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
		boolean done = false;
		if(code!=null) {
			for(String s: coursePrefix) {
				System.out.println(code+ " : "+s);
				if(code.startsWith(s)) {  
					done=true;
					return true;
				}
			}
			if(!done)
				return false;
		}
		return true;
	}

}
