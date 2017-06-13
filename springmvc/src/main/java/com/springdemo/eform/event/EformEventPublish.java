package com.springdemo.eform.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EformEventPublish {
	@Autowired    
	ApplicationEventPublisher eventPublisher;
	
	public void createEvent() {
		eventPublisher.publishEvent(new EformEvent("1"));
		System.out.println("publish event");
	}
}
