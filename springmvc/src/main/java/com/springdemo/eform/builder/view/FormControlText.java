package com.springdemo.eform.builder.view;

import com.springdemo.eform.builder.FormData;
import com.springdemo.eform.builder.FormFieldVo;

public class FormControlText implements FormControl{
	public String doView(FormData formData, FormFieldVo field) throws Exception {
		String m="<input type=\"email\" class=\"form-control\" name=\""+field.getFieldName()+"\">";
		return m;
	}	
}
