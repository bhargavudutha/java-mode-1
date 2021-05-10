package com.day3;

import java.util.Scanner;

public class Replacing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String scentence = sc.nextLine().toLowerCase();
		System.out.println(scentence.replace('d', 'h'));
		sc.close();
	}

}
