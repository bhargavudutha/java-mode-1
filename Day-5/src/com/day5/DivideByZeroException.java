package com.day5;

import java.util.Scanner;
public class DivideByZeroException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
		sc.close();
	}

}
