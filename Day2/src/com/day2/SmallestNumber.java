package com.day2;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		int s;
		Scanner ip = new Scanner(System.in);
		System.out.println("enter 1st number ");
		int num1 = ip.nextInt();
		System.out.println("enter 2nd number ");
		int num2 = ip.nextInt();
		System.out.println("enter 3rd number ");
		int num3 = ip.nextInt();
		if (num1 <= num2 && num1 <= num3)
			System.out.println(num1 + " is the smallest number");
		if (num2 <= num3 && num2 <= num1)
			System.out.println(num2 + " is the smallest number");
		if (num3 <= num2 && num3 <= num1)
			System.out.println(num3 + " is the smallest number");

	}

}
