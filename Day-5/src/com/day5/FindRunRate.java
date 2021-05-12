package com.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class FindRunRate {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(in);
		DecimalFormat d2f = new DecimalFormat("#.##");

		try {
			System.out.println("Enter the total Runs Scored");
			float runs = Float.parseFloat(bufferedReader.readLine());
			System.out.println("Enter the total Overs Faced");
			float overs = Float.parseFloat(bufferedReader.readLine());

			System.out.println("The Current RunRate is : " + d2f.format(runs / overs));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} catch (ArithmeticException ae) {
			System.err.println("Java.lang.ArithmeticException");
		}

	}

}
