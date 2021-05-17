/*11.Given a method with two date strings in yyyy-mm-dd format as input. Write code to find the
difference between two dates in months.  
Include a class UserMainCode with a static method getMonthDifference which accepts
two date strings as input.  
The return type of the output is an integer which returns the diffenece between two dates
in months.  
Create a class Main which would get the input and call the static
method getMonthDifference present in the UserMainCode. 
  
Sample Input 1: 
2012-03-01 
2012-04-16 
Sample Output 1: 
1 
Sample Input 2: 
2011-03-01 
2012-04-16 
Sample Output 2: 
13*/
package com.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.*;

public class DiffBetweenDatesInMonths {
	public static void main(String[] args) throws ParseException, IOException {
		System.out.println("enter dates");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();

		System.out.println(monthsBetweenDates(s1, s2));
	}

	public static int monthsBetweenDates(String s1, String s2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(s1);
		Date d2 = sdf.parse(s2);
		Calendar cal = Calendar.getInstance();

		cal.setTime(d1);
		int months1 = cal.get(Calendar.MONTH);
		int year1 = cal.get(Calendar.YEAR);
		cal.setTime(d2);
		int months2 = cal.get(Calendar.MONTH);
		int year2 = cal.get(Calendar.YEAR);
		int n = ((year2 - year1) * 12) + (months2 - months1);
		return n;
	}
}