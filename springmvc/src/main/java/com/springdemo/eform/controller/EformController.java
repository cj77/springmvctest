package com.springdemo.eform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springdemo.eform.service.EformService;

@Controller
public class EformController {
	@Autowired
	private EformService service;
				
	@ResponseBody
	@RequestMapping("/eform/update.do")
	public String update() {
		service.update();
		return "success";
	}
	
	@ResponseBody
	@RequestMapping("/eform/query.do")
	public String query() {
		service.query("test 1");
		service.query("test 2");
		service.query("test 1");
		return "success";
	}
}
