package com.healthycoderapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoderTest {
	
	@Test
	void should_Set_Correct_Height() {
		Coder code = new Coder(5,54);
		code.setHeight(5);
		Assertions.assertTrue(code.getHeight() == 5);
	}
	
	@Test
	void should_Set_Correct_Weight() {
		Coder code = new Coder(5,54);
		code.setWeight(54);
		Assertions.assertTrue(code.getWeight() == 54);
	}
	
	@Test
	void should_Set_Correct_Age() {
		Coder code = new Coder(5,54,23,Gender.MALE);
		code.setAge(23);
		Assertions.assertTrue(code.getAge() == 23);
	}
	
	@Test
	void should_Set_Correct_Gender() {
		Coder code = new Coder(5,54,24,Gender.FEMALE);
		code.setGender(Gender.FEMALE);
		Assertions.assertTrue(code.getGender() == Gender.FEMALE);
	}
}
