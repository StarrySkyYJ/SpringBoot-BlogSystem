package com.space.configuration.handler;

import org.springframework.security.core.AuthenticationException;

public class PassWordNotMathException extends AuthenticationException{

	/**
	 *  异常处理类
	 */
	private static final long serialVersionUID = 1L;

	public PassWordNotMathException(String msg, Throwable t) {
		super(msg, t);
		// TODO Auto-generated constructor stub
	}
	
	public PassWordNotMathException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

}
