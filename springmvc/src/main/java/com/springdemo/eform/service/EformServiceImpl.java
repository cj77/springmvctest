package com.springdemo.eform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.springdemo.eform.event.EformEventPublish;

@Service
public class EformServiceImpl implements EformService {

	@Autowired
	EformEventPublish eformEventPublish;

	public EformServiceImpl() {
		System.out.println("EformServiceImpl construct");
	}

	public void update() {
		System.out.println("update");
	}

	@Cacheable(value = "cacheTest", unless = "#result == null")
	public String query(String name) {
		eformEventPublish.createEvent();
		System.out.println("call query " + name);
		return "test - " + System.currentTimeMillis();
		// return null;
	}
}
