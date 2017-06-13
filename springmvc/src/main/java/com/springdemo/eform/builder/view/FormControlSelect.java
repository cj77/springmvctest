package com.springdemo.eform.builder.view;

import com.springdemo.eform.builder.FormData;
import com.springdemo.eform.builder.FormFieldVo;

public class FormControlSelect implements FormControl{
	public String doView(FormData formData, FormFieldVo field) throws Exception {
		String m="";
		m+="<select class=\"form-control\">";		
        m+="<option>Disabled select</option>";
        m+="</select>";
		return m;
	}	
}
