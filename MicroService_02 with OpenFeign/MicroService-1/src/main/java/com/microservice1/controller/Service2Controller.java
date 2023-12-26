package com.microservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice1.feignconfig.FeignConfig;

@RestController
public class Service2Controller {
	@Autowired
	private FeignConfig feign;

	@GetMapping("/")
	public String home() {
		String str = feign.gotoHome();
		return "Welcome to Service-02 " + str;
	}

	@GetMapping("/service2")
	public String service1() {
		String str = feign.gotoService1();
		return "Hiiii Service-02 URL!!! " + str;
	}

}
