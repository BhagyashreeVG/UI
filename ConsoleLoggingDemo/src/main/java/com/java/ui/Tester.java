package com.java.ui;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.java.service.UserAuthentication;

public class Tester {

	private static final Log log = LogFactory.getLog(Tester.class);
	public static void main(String[] args) {
		try {
		UserAuthentication user = new UserAuthentication();
		user.checkUser("John");
		log.info("User logged in");
		}
		catch(Exception e) {
			log.info(e.getMessage());
		}
	}
}
