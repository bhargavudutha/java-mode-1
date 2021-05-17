
package com.day7;

public class UserMainCode5 {

	public void validateNumber(String s) {
		if (s.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
			System.out.println("Valid number format");
		else
			System.out.println("Invalid number format");

	}

}
