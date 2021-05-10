package com.day3;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String string = sc.nextLine().toLowerCase();
		String reverseString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverseString += string.charAt(i);
		}

		if (string.equals(reverseString)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		sc.close();
	}

}
