/*Write a program which would accept a string and a character as a delimiter. Apply
the below rules
1. Using the delimiter, split the string and store these elements in array.
2. Reverse each element of the string and convert it into lowercase.
Include a class UserMainCode with a static method manipulateLiteral which
accepts the string and character. The return type is the string array formed.
Create a Class Main which would be used to accept the string and characterand call
the static method present in UserMainCode.
Input and Output Format:
Input consists of a string and character.
Output consists of a string array.
Refer sample output for formatting specifications.
Sample Input 1:
AAA/bba/ccc/DDD
/
Sample Output 1:
aaa
abb
ccc
ddd
 */
package com.day6;

import java.util.Scanner;

public class StringSplitter {
	public static void main(String[] args) {
		System.out.println("enter string");//AS in Sample Input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("enter Delimiter");
		char c = sc.next().charAt(0);
		String[] Split1 = str.split("/");
		for (int i = 0; i < Split1.length; i++) {
			System.out.println(Split1[i]);
		}
		System.out.println("");

		String reverse = new StringBuffer(str).reverse().toString();
		String lower = reverse.toLowerCase();
		String[] Split2 = lower.split("/");

		for (int i = 0; i < Split2.length; i++) {
			System.out.println(Split2[i]);
		}

	}

}
