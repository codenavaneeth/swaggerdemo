package com.nava.sboot.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value=" Index Controller")
public class IndexController {
	

	
	@GetMapping("/hello")
	@ApiOperation(value="Say Hello")
	public String sayHello() {
		return "Hey Developer.!";
	}
	

	@ApiOperation(value="Greet the developer")
	@GetMapping("/greet")
	public String Greet() {
		return "Hey Developer, Good Day!";
	}
	
	@ApiOperation(value="Greet the developer")
	@GetMapping("/greet/{user}")
	public String GreetUser(@ApiParam(value="Logged in user name")@RequestParam String user) {
		return "Hey "+user+", Good Day!";
	}

}
