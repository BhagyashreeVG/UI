package com.healthycoderapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 
class DietPlanTest {
	DietPlan plan = new DietPlan(23,45,56,78);
	
	@Test 
	void should_Set_Correct_Calories() {
		plan.setCalories(22);
		Assertions.assertTrue(plan.getCalories() == 22);
	}
	
	@Test 
	void should_Set_Correct_Carbohydrate() {
		plan.setCarbohydrate(44);
		Assertions.assertTrue(plan.getCarbohydrate() == 44);
	}
	
	@Test 
	void should_Set_Correct_Fat() {
		plan.setFat(12);
		Assertions.assertTrue(plan.getFat() == 12);
	}
	
	@Test 
	void should_Set_Correct_Protein() {
		plan.setProtein(100);
		Assertions.assertTrue(plan.getProtein() == 100);
	}
	
	@Test 
	void should_return_correct_String() {		
		String expectedStr = "Diet [calories=23, protein=45, fat=56, carbohydrate=78]";
		Assertions.assertEquals(expectedStr,plan.toString());
	}
}
