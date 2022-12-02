package com.java.logging;

public class Tester {

	public static void main(String[] args) {
		try {
		UserAuthentication user = new UserAuthentication();
		user.showUser("John", "test");
		System.out.println("User in main");
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

