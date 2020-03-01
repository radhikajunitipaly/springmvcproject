package com.practice.springmvcdemo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.practice.springmvcdemo.annotations.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message = "Last name cannot be null")
	@NotEmpty(message = "Last name cannot be empty")
	@Size(min=1)
	private String lastName;
	
	@NotNull
	@Min(value = 1)
	@Max(value = 10)
	private Integer freePasses;
	
	@Pattern(regexp = "^[A-za-z0-9]{5}")
	private String postalCode;
	
	//@CourseCode(value = "TEST", message = "must start with TESTTES")
	@CourseCode
	private String courseCode;
	
	//private Map<String, String> countriesMap = new LinkedHashMap<>();
	

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Customer() {
		/*countriesMap.put("in", "India");
		countriesMap.put("us", "USA");
		countriesMap.put("no", "Norway");
		countriesMap.put("fr", "France");*/
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
