/*3.Write a Java program to get and display information (year, month, day, hour, minute) of a
default calendar*/

package com.day7;

import java.util.Calendar;

public class GetAndDisplayInfo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("Year: " + cal.get(Calendar.YEAR));
		System.out.println("Month: " + cal.get(Calendar.MONTH));
		System.out.println("Day: " + cal.get(Calendar.DATE));
		System.out.println("Hour: " + cal.get(Calendar.HOUR));
		System.out.println("Minute: " + cal.get(Calendar.MINUTE));
		System.out.println();

	}

}
