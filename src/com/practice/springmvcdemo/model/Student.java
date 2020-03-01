package com.practice.springmvcdemo.model;

import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

public class Student {
	private String firstName;
	
	@NotNull()
	@Size(min = 1, message = "Last name of minimum 1 letter")
	private String lastName;
	private String country;
	private String language;
	private String os;
	
	//private Map<String, String> countriesMap = new LinkedHashMap<>();
	
	public Student() {
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	/*public Map<String, String> getCountriesMap() {
		return countriesMap;
	}
	
	public void setCountriesMap(Map<String, String> countriesMap) {
		this.countriesMap = countriesMap;
	}*/
}
