package com.day7;

public class UserMainCode4 {
	public void checkCharacters(String s) {
		char firstLetter = s.charAt(0);
		char lastLetter = s.charAt(s.length() - 1);
		if (firstLetter == lastLetter)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
