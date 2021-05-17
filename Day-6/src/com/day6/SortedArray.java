/*Write a program to read a string array, remove duplicate elements and sort the array.
Note:
1.     The check for duplicate elements must be case-sensitive. (AA and aa are
NOT duplicates)
2.     While sorting, words starting with upper case letters takes precedence.
Include a class UserMainCode with a static method orderElements which accepts
the string array. The return type is the sorted array.
Create a Class Main which would be used to accept the string arrayand integer and
call the static method present in UserMainCode.
Input and Output Format:
Input consists of an integer n which is the number of elements followed by n string
values.
Output consists of the elements of string array.
Refer sample output for formatting specifications.
Sample Input 1:
6
AAA
BBB
AAA
AAA
CCC
CCC
Sample Output 1:
AAA
BBB
CCC

Sample Input 2:
7
AAA
BBB
aaa
AAA
Abc
A
b
Sample Output 2:
A

AAA
Abc
BBB
aaa
b*/
package com.day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a1 = new String[n];
		for (int i = 0; i < n; i++) {
			a1[i] = sc.next();
		}
		a1 = orderElements(a1);
		for (int i = 0; i < a1.length; i++) {
			System.out.println("" + a1[i]);
		}

		sc.close();
	}

	public static String[] orderElements(String[] arr) {
		HashSet<String> al = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		Iterator<String> itr = al.iterator();
		arr = new String[al.size()];
		int i = 0;
		while (itr.hasNext()) {
			arr[i] = itr.next();
			i++;
		}
		Arrays.sort(arr);
		return arr;
	}

}
