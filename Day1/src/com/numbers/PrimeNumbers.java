package com.numbers;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("enter number");
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 1)
			System.out.println(num + " is prime number");
		else
			System.out.println(num + " is not a prime number");
		ip.close();

	}

}
