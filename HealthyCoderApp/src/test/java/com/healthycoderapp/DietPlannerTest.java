package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DietPlannerTest {

	private DietPlanner dietPlanner;

	@BeforeEach
	void setup() {
		this.dietPlanner = new DietPlanner(20, 30, 50);
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("A unit test was finished.");
	}

	@RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
	void should_ReturnCorrectDietPlan_When_CorrectCoder() {
		// given
		Coder coder = new Coder(1.82, 75.0, 26, Gender.MALE);
		DietPlan expected = new DietPlan(2202, 110, 73, 275);

		// when
		DietPlan actual = dietPlanner.calculateDiet(coder);

		// then
		assertAll(() -> assertEquals(expected.getCalories(), actual.getCalories()),
				() -> assertEquals(expected.getProtein(), actual.getProtein()),
				() -> assertEquals(expected.getFat(), actual.getFat()),
				() -> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate())
		);
	}
	
	@Nested
	class DietPlannerUnitTest {
		
		@Test
		void should_Throw_Exception_When_FPCSum_Isnotequal_Hundred() {
			//given
			int proteinPercentage = 10;
			int fatPercentage = 20; 
			int carbohydratePercentage = 30;
			
			//when
			Executable exec = () -> System.out.println(new DietPlanner(proteinPercentage, fatPercentage, carbohydratePercentage));
			
				
			//then
			RuntimeException exception = Assertions.assertThrows(RuntimeException.class, exec);
			Assertions.assertEquals("protein, fat and carbohydrate percentages must add up to 100!", exception.getMessage());
		}
		
		@Test
		void should_Calculate_BMRForFemale() {
			Coder code = new Coder (5, 54, 23, Gender.FEMALE);
			DietPlanner planner = new DietPlanner(30, 40, 30);
			int  bmi = planner.calculateBMR(code);
			Assertions.assertEquals(2418, bmi);
		}
	}
		
	@Nested
	class BMICalculatorTest {
		@Test
		void should_test_isDietRecommended_For_Exception() {
			Executable exec = ()-> BMICalculator.isDietRecommended(23.0, 0.0);
			Assertions.assertThrows(ArithmeticException.class, exec);
		}
		
		@Test
		void should_test_isDietRecommended_For_Truthy() {	
			Assertions.assertTrue(BMICalculator.isDietRecommended(600, 4));
		}
		
		@Test
		void should_test_isDietRecommended_For_Falsy() {	
			Assertions.assertFalse(BMICalculator.isDietRecommended(23, 4));
		}
	}

}