package com.numbers;

import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 != 0) {
				sum = sum + rem;
			}
			n = n / 10;
		}
		if (sum % 2 == 0)
			System.out.println("" + -1);
		else
			System.out.println("" + 1);

	}
}
