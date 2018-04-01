package com.abc.action;



import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getIndex() {
		Logger logger = Logger.getLogger(IndexAction.class);
		logger.debug("loger.dubug访问了IndexAction方法");
		logger.error("loger.error访问了IndexAction方法");
		logger.info("loger.info访问了IndexAction方法");
		logger.warn("loger.warn访问了IndexAction方法");
		System.out.println("访问了IndexAction方法");
		return SUCCESS;
	}

}
