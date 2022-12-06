package com.myapp;

import org.apache.commons.configuration2.builder.fluent.Configurations;

import com.myapp.dto.Employee;
import com.myapp.validator.Validator;

public class Tester {
	public static void main(String[] args) throws Exception{		
		try {
			Employee employee = new Employee(99,"John",120000);
			new Validator().validate(employee);
			System.out.println("The employee details are successfully validated.");
		} 
		catch (Exception exception) {
			System.out.println(new Configurations().properties("configuration.properties").getProperty(exception.getMessage()));
		}
	}
}