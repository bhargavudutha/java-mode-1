/*2.    Number Validation

Write a program to read a string of 10 digit number , check whether the string contains a
10 digit number in the format XXX-XXX-XXXX where &#39;X&#39; is a digit.
 
Include a class UserMainCode with a static method validateNumber which accepts a
string as input .
The return type of the output should be 1 if the string meets the above specified format .
In case the number does not meet the specified format then return -1 as output.
 
Create a class Main which would get the input as a String of numbers and call the static
methodvalidateNumber present in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output is a string specifying the given string is valid or not .
Refer sample output for formatting specifications.
 
Sample Input 1:
123-456-7895
Sample Output 1:
Valid number format
Sample Input 2:
-123-12344322
Sample Output 2:
Invalid number format*/
package com.day7;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string in given input format:");
		String s = sc.nextLine();
		UserMainCode5 umc = new UserMainCode5();
		umc.validateNumber(s);

	}

}
