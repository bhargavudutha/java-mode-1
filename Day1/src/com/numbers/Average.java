package com.numbers;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		float Average = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("enter 1st number ");
		int num1 = ip.nextInt();
		System.out.println("enter 2nd number ");
		int num2 = ip.nextInt();
		System.out.println("enter 3rd number ");
		int num3 = ip.nextInt();
		Average = (float) (num1 + num2 + num3) / 3;
		System.out.println("Average of 3 numbers is " + Average);
		ip.close();

	}

}
