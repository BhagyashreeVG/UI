package com.java.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserAuthentication {
	Log logger = LogFactory.getLog(UserAuthentication.class);
	
	public void showUser(String username, String password) throws Exception {
		
		try {
			if(username.isBlank() || password.isBlank()) {
				throw new Exception("Service.INVALID_CREDENTIALS");
			}
			logger.info("Inside function definition");
		}catch(Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
		
	}
}

