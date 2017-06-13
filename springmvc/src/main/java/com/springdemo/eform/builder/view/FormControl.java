package com.springdemo.eform.builder.view;

import com.springdemo.eform.builder.FormData;
import com.springdemo.eform.builder.FormFieldVo;

public interface FormControl {
	public static final String FORMCONTROL_TEXT="text";
	public static final String FORMCONTROL_SELECT ="select";
	public static final String FORMCONTROL_RADIO ="radio";
	public static final String FORMCONTROL_CHECKBOX ="checkbox";
	
 	public String doView(FormData formData, FormFieldVo field) throws Exception;
}
