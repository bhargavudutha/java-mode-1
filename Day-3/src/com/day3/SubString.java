package com.day3;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = sc.nextLine();
		System.out.println("Enter the Starting index :");
		int startIndex = sc.nextInt();
		System.out.println("Enter the Ending index :");
		int endIndex = sc.nextInt();
		System.out.println("SubString :");
		System.out.println(string.substring(startIndex, endIndex));

		sc.close();

	}
}
