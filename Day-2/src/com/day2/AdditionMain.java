package com.day2;

import java.util.Scanner;

public class AdditionMain {
	public static void main(String[] args) {
		Addition addition = new Addition();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number");
		int number2 = sc.nextInt();
		System.out.println("Enter the third number");
		int number3 = sc.nextInt();
		System.out.println("Enter the fourth number");
		int number4 = sc.nextInt();
		System.out.println("Enter the fifth number");
		int number5 = sc.nextInt();
		System.out.println("Enter the sixth number");
		int number6 = sc.nextInt();
		System.out.println("---------------------------------------------------");
		System.out.println(number1 + " + " + number2 + " = " + addition.add(number1, number2));
		System.out
				.println(number1 + " + " + number2 + " + " + number3 + " = " + addition.add(number1, number2, number3));
		System.out.println(number1 + " + " + number2 + " + " + number3 + " + " + number4 + " = "
				+ addition.add(number1, number2, number3, number4));
		System.out.println(number1 + " + " + number2 + " + " + number3 + " + " + number4 + " + " + number5 + " = "
				+ addition.add(number1, number2, number3, number4, number5));
		System.out.println(number1 + " + " + number2 + " + " + number3 + " + " + number4 + " + " + number5 + " + "
				+ number6 + " = " + addition.add(number1, number2, number3, number4, number5, number6));

		sc.close();
	}

}
