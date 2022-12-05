package com.java.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Tester {
	
	@Test
	public void test_string_true() {
		JunitTest obj = new JunitTest();
		Assertions.assertFalse(obj.testString("Hello Every1"));
	}
	
	@Test
	public void test_string_false() {
		JunitTest obj = new JunitTest();
		Assertions.assertTrue(obj.testString("Hello Everyone"));
	}
}
