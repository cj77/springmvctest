package com.springdemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class DateUtilsTest {
	@Test
	public void test1() throws Exception{
		GregorianCalendar calendar = new GregorianCalendar(1999,1,1);
		Date time = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(time));
		
		System.out.println("******************************************************************");
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());
		gc.add(5, 5);
		gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc.get(Calendar.DATE));
		time= gc.getTime();
		System.out.println(sdf.format(time));
		
		System.out.println("******************************************************************");
		gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH));
		
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.HOUR));
		System.out.println(gc.get(Calendar.HOUR_OF_DAY));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(gc.get(Calendar.WEEK_OF_MONTH));
		System.out.println(gc.get(Calendar.WEEK_OF_YEAR));	
		
	}
}
