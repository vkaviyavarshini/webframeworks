package com.example.springapp.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
    @Value("${thank.page}")
	private String testPageString;
    @GetMapping ("/")
	public String getValue() {
		return "Welcome to this "+testPageString;
	}
    
}