package com.day7;

public class UserMainCode1 {

	public void sumOfSquaresOfEvenDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				sum = sum + rem * rem;
			}
			num = num / 10;
		}
		System.out.println(" sum of squares of even digits is " + sum);

	}

}
