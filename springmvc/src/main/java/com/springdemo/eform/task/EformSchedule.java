package com.springdemo.eform.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EformSchedule {
	private static long startTime=0;
	public EformSchedule(){
		System.out.println("EformSchedule");
		startTime=System.currentTimeMillis();
	}
	
	@Scheduled(fixedDelay=120000,initialDelay=1000)
	public void doTask(){
		System.out.println("doTask - " + (System.currentTimeMillis() - startTime ));
		startTime=System.currentTimeMillis();
	}
}
