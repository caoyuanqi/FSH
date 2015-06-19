package com.qiyue.service;

import java.util.logging.Logger;

public class BaseService {
	// Logger for the loggering
	protected Logger logger = Logger.getLogger(this.getClass().getName());

	
	protected void log(String message){
		logger.info(message);
	}
}
