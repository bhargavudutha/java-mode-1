package com.day4;

import java.util.Scanner;

import com.day4.MyCalculator;
import com.day4.AdvancedArithmetic;

public class AdvancedArithmeticMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdvancedArithmetic mycalculator = new MyCalculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();
		System.out.println("The Divisor Sum of the Number " + number + " is : " + mycalculator.divisorSum(number));

		scanner.close();

	}

}
