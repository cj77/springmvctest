package com.springdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.interceptor.LoginAnnon;
/**
 * test git 11
 * @author CJ
 *
 */
@Controller
public class TestController {
	private static final Logger log = Logger.getLogger(TestController.class.getName());
	
	@LoginAnnon
	@RequestMapping("/demo")
    public String index(){
		log.debug("request mapping /demo");
        return "demo";
    }
	
	@RequestMapping("/test")
    public String toTest(){
		log.debug("request mapping /test");
		
        return "demo";
    }
	
	@RequestMapping("/error")
    public String toError(){
		log.debug("request mapping /error");
        return "demo";
    }
}
