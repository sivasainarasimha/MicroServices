package com.microservice1.feignconfig;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("MICROSERVICE01")
public interface FeignConfig {
	@GetMapping("/")
	public String gotoHome() ;
	
	@GetMapping("/service1")
	public String gotoService1() ;

}
