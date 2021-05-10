package com.numbers;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		int sum, sub, mul, div, mod;
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st number ");
		int num1 = s.nextInt();
		System.out.println("enter 2nd number ");
		int num2 = s.nextInt();
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		System.out.println("sum is " + sum);
		System.out.println("difference is " + sub);
		System.out.println("multiplication is " + mul);
		System.out.println("division is " + div);
		System.out.println("Remainder is " + mod);
		s.close();

	}

}
