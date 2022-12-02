package com.java.properties;

import java.util.Iterator;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

public class PropertiesDemo {

	public static void main(String[] args) {
		
		Configurations configurations = new Configurations();
		try {	
			PropertiesConfiguration config = configurations.properties("config.properties");
			
			Iterator<String> keys = config.getKeys();
			while (keys.hasNext()) {
				String key = keys.next();
				System.out.println(""+config.getProperty(key));
			}
		}
		catch (org.apache.commons.configuration2.ex.ConfigurationException e) {
			e.printStackTrace();
		}
	}

}
