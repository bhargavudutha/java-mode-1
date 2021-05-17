package com.day7;

public class UserMainCode {
	public void checkSum(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				sum = sum + rem;
			}
			num = num / 10;
		}
		if (sum % 2 == 0)
			System.out.println("sum of odd digits is even");
		else
			System.out.println("sum of odd digits is odd");

	}

}
