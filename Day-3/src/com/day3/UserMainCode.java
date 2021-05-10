package com.day3;

public class UserMainCode {
	public static String getString(String input) {
		input = input.toLowerCase();
		String output = " ";
		if (input.charAt(0) == 'k') {
			output = output + 'k';

		}
		if (input.charAt(1) == 'b') {
			output = output + 'b';
		} else {
			output = output + input.substring(2, input.length());
		}
		return output;
	}

	public static void main(String[] args) {
		UserMainCode userMainCode = new UserMainCode();
		System.out.println(userMainCode.getString("hello"));
		System.out.println(userMainCode.getString("kava"));

	}

}
