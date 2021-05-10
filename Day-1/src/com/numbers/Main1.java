package com.numbers;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String words = sc.nextLine();
		LongestWord lw = new LongestWord();
		System.out.println(LongestWord.getLargestWord(words));
		sc.close();

	}

}
