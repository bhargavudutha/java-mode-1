package com.day3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserMainCode1 umc = new UserMainCode1();
		System.out.println("Enter the String : ");
		String str = sc.next();
		System.out.println("Enter the Character : ");
		char character = sc.next().charAt(0);
		System.out.println("The Reshaped String : ");
		System.out.println(umc.Reshape(str, character));

		sc.close();

	}

}
