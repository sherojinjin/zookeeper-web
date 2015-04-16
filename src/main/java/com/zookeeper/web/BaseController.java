package com.zookeeper.web;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

	@ExceptionHandler
	public String handleException(Exception ex){
		return ex.getMessage();
	}
}
