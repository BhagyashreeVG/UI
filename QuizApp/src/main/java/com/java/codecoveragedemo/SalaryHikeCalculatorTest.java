package com.java.codecoveragedemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryHikeCalculatorTest {
	
		@Test
		public void calculateHikeInSalaryValidTest1() {
			SalaryHikeCalculator s1=new SalaryHikeCalculator();
			Integer experience=6;
			Integer feedback=5;
			Float actual = s1.calculateHikeInSalary(experience,feedback);
			Assertions.assertEquals(35000, actual);
		}
		
		@Test
		public void calculateHikeInSalaryValidTest2() {
			SalaryHikeCalculator s1=new SalaryHikeCalculator();
			Integer experience=3;
			Integer feedback=5;
			Float actual = s1.calculateHikeInSalary(experience,feedback);
			Assertions.assertEquals(27000, actual);
		}
		@Test
		public void calculateHikeInSalaryValidTest3() {
			SalaryHikeCalculator s1=new SalaryHikeCalculator();
			Integer experience=2;
			Integer feedback=5;
			Float actual = s1.calculateHikeInSalary(experience,feedback);
			Assertions.assertEquals(23000, actual);
		}
		@Test
		public void calculateHikeInSalaryValidTest4() {
			SalaryHikeCalculator s1=new SalaryHikeCalculator();
			Integer experience=2;
			Integer feedback=3;
			Float actual = s1.calculateHikeInSalary(experience,feedback);
			Assertions.assertEquals(15000, actual);
		}
	

}