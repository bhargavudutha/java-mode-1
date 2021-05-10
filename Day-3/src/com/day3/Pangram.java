package com.day3;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String sentence = sc.nextLine().toLowerCase();
		char[] charArray = new char[26];
		int j = 0;
		boolean checkStatus = true;
		for (int i = 97; i <= 122; i++) {
			charArray[j] = (char) i;
			j++;
		}

		if (sentence.length() > 26) {
			for (int i = 0; i < charArray.length; i++) {
				int k = sentence.indexOf(charArray[i]);
				if (k < 0) {
					System.out.println("The sentence is Not a Pangram");
					checkStatus = false;
					break;
				}
			}
			if (checkStatus) {
				System.out.println("The sentence is Pangram");
			}
		} else {
			System.out.println("The sentence is Not a Pangram");
		}
		sc.close();
	}

}
