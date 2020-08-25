package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
	
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration(){
		return new LimitConfiguration(1000,1);
		
	}

}
