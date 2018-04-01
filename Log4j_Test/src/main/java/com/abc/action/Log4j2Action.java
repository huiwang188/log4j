package com.abc.action;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class Log4j2Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Logger logger = LogManager.getLogger(Log4j2Action.class);
	
	public String execute() {
		System.out.println("访问了log4j2Action默认方法");
		logger.info("访问了info");
		logger.warn("访问了warn");
		logger.error("访问了error");
		logger.debug("访问了debug");
		logger.fatal("访问了fatal");
		return SUCCESS;
	}

}
