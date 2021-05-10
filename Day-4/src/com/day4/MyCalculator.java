package com.day4;

import com.day4.AdvancedArithmetic;

public class MyCalculator implements AdvancedArithmetic {
	@Override
	public int divisorSum(int number) {
		System.out.println("I implemented : AdvancedArthimetic");
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum + number;
	}

}
