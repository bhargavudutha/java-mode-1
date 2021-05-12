package com.day5;

import java.util.Scanner;
import com.day5.CustomException;

public class IPLPlayerAge {
	public static void main(String[] args) throws CustomException {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter The Player Name :");
			String playerName = sc.nextLine();
			System.out.println("Enter The Player Age :");
			int playerAge = sc.nextInt();
			if (playerAge < 19) {
				throw new CustomException("InvalidAgeRange");
			}

			System.out.println("Enter The Player Name : " + playerName);
			System.out.println("Enter The Player Age : " + playerAge);
		} catch (CustomException ce) {
			System.err.println(ce.getMessage());
		}
		sc.close();

	}

}
