/*5.    Check Characters in a String
Write a program to read a string  and to test whether first and last character are same.
The string is said to be be valid if the 1st and last character are the same. Else the
string is said to be invalid.
 
Include a class UserMainCode with a static method checkCharacters which accepts a
string as input .
The return type of this method is an int.  Output should be 1 if the first character and last
character are same . If they are different then return -1 as output.
 
Create a class Main which would get the input as a string and call the static
method checkCharacterspresent in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output is a string saying characters are same or not .
Refer sample output for formatting specifications.
 
Sample Input 1:
the picture was great
Sample Output 1:
Valid
 
Sample Input 1:
this
Sample Output 1:
Invalid*/
package com.day7;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		UserMainCode4 umc = new UserMainCode4();
		umc.checkCharacters(s);

	}

}
