package com.numbers;

public class UserMainCode {
	public static void sumOfSquaresofEven(int n) {
		int sum = 0, rem;
		while (n > 0) {
			rem = n % 10;
			if (rem % 2 == 0) {
				sum = sum + rem * rem;
				;
			}
			n = n / 10;
		}
		System.out.println("sum of squares of even digits is " + sum);

	}

}
