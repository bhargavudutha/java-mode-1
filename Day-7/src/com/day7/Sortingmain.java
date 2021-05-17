/* 8. Write a code to read two int array lists of size 5 each as input and to merge the
two arrayLists, sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th
and 8th index into a new arrayList and return the final ArrayList. 
 Include a class UserMainCode with a static method sortMergedArrayList which accepts
2 ArrayLists. 

 The return type is an ArrayList with elements from 2,6 and 8th index position
.Array index starts from position 0. 
 Create a Main class which gets two array list of size 5 as input and call the static
method sortMergedArrayList present in the UserMainCode. 
Sample Input: 
3 
1 
17 
11 
19 
5 
2 
7 
6 
20 
Sample Output: 
3 
11 
19 
Sample Input : 
1 
2 
3 
4 
5 
6 
7 
8 
9 
10 
Sample Output : 
3 
7 
9*/

package com.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sortingmain {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			list1.add(sc.nextInt());
		for (int j = 0; j < 5; j++)
			list2.add(sc.nextInt());
		result = SortingUserMainCode.sortMergedArrayList(list1, list2);
		for (int k = 0; k < 3; k++)
			System.out.println(result.get(k));
	}

}
