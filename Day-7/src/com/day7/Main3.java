/*4.    Fetching Middle Characters from String
 
Write a program to read a string of even length and to fetch two middle most characters
from the input string and return it as string output.
 
Include a class UserMainCode with a static method getMiddleChars which accepts a
string of even length as input . The return type is a string which should be the middle
characters of the string.
 
Create a class Main which would get the input as a string and call the static
method getMiddleCharspresent in the UserMainCode.
 
Input and Output Format:
Input consists of a string of even length.
Output is a string .
Refer sample output for formatting specifications.
 
Sample Input 1:
this
Sample Output 1:
hi
 
Sample Input 1:
Hell
Sample Output 1:
el*/
package com.day7;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		UserMainCode3 umc = new UserMainCode3();
		umc.getMiddleChars(s);

	}

}