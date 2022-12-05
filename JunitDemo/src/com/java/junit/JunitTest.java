package com.java.junit;

public class JunitTest {
	public boolean testString(String arg) {
		String regex = "[A-Za-z!\\s]+";
		if(arg.matches(regex)) 
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JunitTest obj = new JunitTest();
		System.out.println(obj.testString("Hello Every1"));	
		System.out.println(obj.testString("Hello Everyone!"));	
	}

}
