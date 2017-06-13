package com.springdemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	// 继承HandlerInterceptorAdapter类

	// 重写 preHandle()方法，在业务处理器处理请求之前对该请求进行拦截处理
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		/**
		 * UserModal user = (UserModal)
		 * request.getSession().getAttribute("userInfo"); if (user == null) {
		 * response.sendRedirect("/toLogin.do"); return false; }
		 **/

		System.out.println("preHandle");

		if (handler instanceof HandlerMethod) {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			LoginAnnon annon = handlerMethod.getMethodAnnotation(LoginAnnon.class);
			if (annon != null) {
				request.getRequestDispatcher("/error").forward(request, response);
				return false;
			}
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView mav) throws Exception {
		System.out.println("----------postHandle");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception excptn) throws Exception {
	}
}
