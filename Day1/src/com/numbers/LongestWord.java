package com.numbers;

import java.util.StringTokenizer;

public class LongestWord {
	public static String getLargestWord(String words) {
		int max = 0;
		StringTokenizer st = new StringTokenizer(words, " ");
		while (st.hasMoreTokens()) {
			String string = st.nextToken();
			int num = string.length();
			if (num > max) {
				max = num;
				words = string;
			}

		}
		return words;
	}

}
