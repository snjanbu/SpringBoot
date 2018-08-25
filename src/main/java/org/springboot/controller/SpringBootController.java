package org.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@RequestMapping("/welcome")
	//If the methodName is same as the param in RequestMapping,no need to mention it.
	public String sayWelcome() {
		return "Welcome to the first page";
	}

}
