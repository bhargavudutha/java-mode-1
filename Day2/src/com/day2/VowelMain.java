package com.day2;

import java.util.Scanner;

public class VowelMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		NumberOfVowels nv = new NumberOfVowels();
		nv.VowelsCount(str);

	}
}
