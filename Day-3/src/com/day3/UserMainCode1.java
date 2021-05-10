package com.day3;

public class UserMainCode1 {
	static String Reshape(String str, char character) {

		String reshapeString = "";
		for (int i = str.length() - 1; i > 0; i--) {
			reshapeString += str.charAt(i);
			reshapeString += character;
		}
		reshapeString += str.charAt(0);
		return reshapeString;
	}

}
