/*13.Get two date strings as input and write code to find difference between two dates in days. 
Include a class UserMainCode with a static method getDateDifference which accepts two
date strings as input. 
The return type of the output is an integer which returns the difference between two dates
in days. 
Create a class Main which would get the input and call the static
method getDateDifference present in the UserMainCode. 
  
Sample Input 1: 
2012-03-12 
2012-03-14 
Sample Output 1: 
2 
 
Sample Input 2: 
2012-04-25 
2012-04-28 
Sample Output 2: 
3*/

package com.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DiffbwTwoDatesInDays {
	public static int dateDifference(String s1, String s2) throws ParseException {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sd.parse(s1);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		long d1 = c.getTimeInMillis();
		d = sd.parse(s2);
		c.setTime(d);
		long d2 = c.getTimeInMillis();
		int n = Math.abs((int) ((d1 - d2) / (1000 * 3600 * 24)));
		return n;
	}

	public static void main(String[] args) throws ParseException {
		String s1 = "2012-03-12";
		String s2 = "2012-03-14";
		System.out.println(dateDifference(s1, s2));

	}

}
