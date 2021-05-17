//2.Write a Java program to extract date, time from the date string
package com.day7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ExtractDateAndTime {
	public static void main(String[] args) throws Exception {
		String Date = "2021/05/13";
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		java.util.Date dtt = df.parse(Date);
		System.out.println(dtt);

	}
}
