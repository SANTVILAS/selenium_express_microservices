package com.seleniumexpress.addressapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.seleniumexpress.addressapp.response.AddressResponse;
import com.seleniumexpress.addressapp.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;

	@GetMapping("/address/{id}")
	public ResponseEntity<AddressResponse> getAddressById(@PathVariable("id") int id) {
		AddressResponse addressResponse = addressService.findAddressByEmployeeId(id);
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
	
}
