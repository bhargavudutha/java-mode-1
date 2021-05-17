package com.day7;

public class UserMainCode3 {

	public static void getMiddleChars(String s) {
		int len = s.length();
		int middle = len / 2;
		System.out.print(s.charAt(middle - 1));
		System.out.print(s.charAt(middle));

	}
}
