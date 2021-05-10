package com.day3;

import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
		int[] array = new int[10];
		boolean Status = false;
		System.out.println("Enter the intergers into Array");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the element to Search");
		int number = sc.nextInt();
		System.out.println("Elements in the Array:");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(array[array.length - 1]);

		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				Status = true;
			}
		}
		if (Status) {
			System.out.println(number + " was found");
		} else {
			System.out.println(number + " was not found");
		}

		sc.close();
	}

}
