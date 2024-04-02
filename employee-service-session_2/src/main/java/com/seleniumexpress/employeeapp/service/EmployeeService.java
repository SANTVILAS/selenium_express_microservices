package com.seleniumexpress.employeeapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.employeeapp.entity.Employee;
import com.seleniumexpress.employeeapp.repo.EmployeeRepo;
import com.seleniumexpress.employeeapp.response.EmployeeResponse;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeResponse getEmployeeById(Integer id) {
		
		//employee--->employeeResponse
		Employee employee=employeeRepo.findById(id).get();
//		EmployeeResponse employeeResponse = new EmployeeResponse();
//		employeeResponse.setId(employee.getId());
//		employeeResponse.setName(employee.getName());
//		employeeResponse.setEmail(employee.getEmail());
//		employeeResponse.setBloodgroup(employee.getBloodgroup());
		
		//From Above thing we have replacement of modelMapper
		
		EmployeeResponse employeeResponse=modelMapper.map(employee, EmployeeResponse.class);
		
		return employeeResponse;
	}
	
}
