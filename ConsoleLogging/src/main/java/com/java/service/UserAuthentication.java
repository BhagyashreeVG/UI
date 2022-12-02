package com.java.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserAuthentication {
	Log logger = LogFactory.getLog(UserAuthentication.class); 
	
	public void checkUser(String username) throws Exception {
		try {
			if(username.isBlank()) {
				throw new Exception("SERVICE.INVALIDCREDENTIALS");
			}
			logger.info("Logged in successfully");
			
		}catch(Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}
}
