package com.day2;

public class NumberOfVowels {

	public static void VowelsCount(String str) {

		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("number of vowels are" + count);
	}
}
