package com.day3;

import java.util.Scanner;

public class LowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence or String");
		String str = sc.nextLine();
		System.out.println(str.toLowerCase());
		sc.close();

	}
}
