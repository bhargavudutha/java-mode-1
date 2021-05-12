package com.day5;

import java.util.Scanner;

import com.day5.LessThanZeroException;
import com.day5.MyCalculator;

public class FindPowerOf {
	public static void main(String[] args) throws LessThanZeroException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		MyCalculator myCalculator = new MyCalculator();
		try {
			System.out.println("Power of Two Numbers : " + myCalculator.Power(num1, num2));
		} catch (LessThanZeroException ltxe) {
			System.err.println(ltxe.getMessage());
		}

		sc.close();
	}

}
