package com.https.demo.springhttpsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

	
	@GetMapping("/https")
	public String demo(){
		return "HTTPS";
	}
}
