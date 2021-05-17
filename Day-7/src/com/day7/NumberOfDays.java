/*5..Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), write a
program to find out total number of days in the given month for the given year.*/
package com.day7;

import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numberOfDaysInMonth = 0;
		String MonthOfName = "";

		System.out.print("Enter month number: ");
		int month = sc.nextInt();

		System.out.print("Enter year: ");
		int year = sc.nextInt();

		switch (month) {
		case 0:
			MonthOfName = "January";
			numberOfDaysInMonth = 31;
			break;
		case 1:
			MonthOfName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				numberOfDaysInMonth = 29;
			} else {
				numberOfDaysInMonth = 28;
			}
			break;
		case 2:
			MonthOfName = "March";
			numberOfDaysInMonth = 31;
			break;
		case 3:
			MonthOfName = "April";
			numberOfDaysInMonth = 30;
			break;
		case 4:
			MonthOfName = "May";
			numberOfDaysInMonth = 31;
			break;
		case 5:
			MonthOfName = "June";
			numberOfDaysInMonth = 30;
			break;
		case 6:
			MonthOfName = "July";
			numberOfDaysInMonth = 31;
			break;
		case 7:
			MonthOfName = "August";
			numberOfDaysInMonth = 31;
			break;
		case 8:
			MonthOfName = "September";
			numberOfDaysInMonth = 30;
			break;
		case 9:
			MonthOfName = "October";
			numberOfDaysInMonth = 31;
			break;
		case 10:
			MonthOfName = "November";
			numberOfDaysInMonth = 30;
			break;
		case 11:
			MonthOfName = "December";
			numberOfDaysInMonth = 31;
		}
		System.out.print(MonthOfName + " " + year + " has " + numberOfDaysInMonth + " days\n");
		sc.close();
	}

}
