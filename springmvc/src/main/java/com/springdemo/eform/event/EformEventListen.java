package com.springdemo.eform.event;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EformEventListen {
	@Async
	@EventListener
	public void handleEvent(EformEvent event){
		System.out.println("handleEvent111 " + event.getSource());
	}
		
	@EventListener
	public void handleEvent222(EformEvent event){
		System.out.println("handleEvent222 " + event.getSource());
	}
}
