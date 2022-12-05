package com.java.codecoveragedemo;

public class SalaryHikeCalculator {
	public Float calculateHikeInSalary(Integer experienceInYears, Integer feedbackPoints) {
		Float hike = 0.0f;
		if (experienceInYears > 3 && feedbackPoints > 4) {// Block1
			hike = 35000f;
		}
		else if (experienceInYears > 2 && feedbackPoints > 4) {// Block2
			hike = 27000f;
		}
		else if (experienceInYears > 1 && feedbackPoints > 4) {// Block3
			hike = 23000f;
		}
		else {// Block4
			hike = 15000f;
		}
		return hike;
	}
}
