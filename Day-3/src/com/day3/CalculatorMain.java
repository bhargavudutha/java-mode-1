package com.day3;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Number");
		int number1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int number2 = sc.nextInt();

		System.out.println("Addition of Numbers is : " + c.add(number1, number2));
		sc.close();
	}

}
