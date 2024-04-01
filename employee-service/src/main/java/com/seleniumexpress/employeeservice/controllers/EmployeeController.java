package com.seleniumexpress.employeeservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
	@Autowired
	private RestTemplate restTemplate;

	// reuirement return address data as well along with Employee data
	
	
	@GetMapping("employee")
	public String getEmployee() {
		
		//get the data address service by hitting this http://locahost:8080/address
		
		String address =restTemplate.getForObject("http://localhost:8082/address", String.class);
		return "Name : Santvilas ,Email :santvilas34@gmail.com"+address;
	}
	
}
