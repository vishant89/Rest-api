package com.springboot.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	
	@GetMapping(value ="/h")
	public String heloWorld() {
		return  "Hello World";
	}

}
