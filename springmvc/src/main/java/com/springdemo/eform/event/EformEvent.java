package com.springdemo.eform.event;

import org.springframework.context.ApplicationEvent;

public class EformEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EformEvent(String id) {
		super(id);
	}
}
