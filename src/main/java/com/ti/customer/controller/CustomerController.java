package com.ti.customer.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ti.customer.entity.Secret;

@RestController
@RequestMapping("/uri")
public class CustomerController {
	
	@RequestMapping(value="/loginup",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, 
			method = RequestMethod.GET)
	public Secret getLogin() {
		Secret secret = new Secret();
		secret.setId(1);
		secret.setSecret("121212");
		
		return secret;
		
	}
	
}
