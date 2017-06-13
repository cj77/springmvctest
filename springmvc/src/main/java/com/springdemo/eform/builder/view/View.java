package com.springdemo.eform.builder.view;

import com.springdemo.eform.builder.FormData;
import com.springdemo.eform.builder.FormFieldVo;

public abstract class View {
	public abstract String doView(FormData formData) throws Exception;
	
	public String diView(FormData formData ,FormFieldVo field) throws Exception{	
		return "";
	}
	
}
