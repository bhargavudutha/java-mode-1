package com.day2;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		MiddleCharacter mc = new MiddleCharacter();
		mc.printMiddleCharacter(str);
		sc.close();

	}

}
