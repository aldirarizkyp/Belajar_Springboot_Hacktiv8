package com.learning.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHelloWorldController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}