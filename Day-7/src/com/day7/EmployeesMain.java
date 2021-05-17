/*A Company wants to obtain employees of a particular designation. You have been assigned
as the programmer to build this package. You would like to showcase your skills by creating a
quick prototype. The prototype consists of the following steps: 
    Read Employee details from the User. The details would include name
and designaton in the given order. The datatype for name and designation is string. 
    Build a hashmap which contains the name as key and designation as value. 
    You decide to write a function obtainDesignation which takes the hashmap and
designation as input and returns a string array of employee names who belong to that
designation as output. Include this function in class UserMainCode. 
Create a Class Main which would be used to read employee details in step 1 and build
the hashmap. Call the static method present in UserMainCode. 
Sample Input 1: 
4 
Manish 
MGR 
Babu 

CLK 
Rohit 
MGR 
Viru 
PGR 
MGR 
 
Sample Output 1: 
Manish 
Rohit*/
package com.day7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class EmployeesMain {
	public static void main(String[] args) {
		System.out.println("Give input");
		Scanner sc = new Scanner(System.in);
		int k1 = Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		for (int i = 0; i < k1; i++) {
			String k = sc.nextLine();
			String s = sc.nextLine();
			hm.put(k, s);
		}
		String n = sc.nextLine();
		LinkedHashMap<String, String> hm1 = new LinkedHashMap<String, String>();
		hm1 = dis(hm, n);
		Iterator<String> it = hm1.keySet().iterator();

		while (it.hasNext()) {
			String s2 = it.next();
			System.out.println(s2);
		}

	}

	public static LinkedHashMap<String, String> dis(LinkedHashMap<String, String> h1, String n) {

		LinkedHashMap<String, String> hm1 = new LinkedHashMap<String, String>();
		Iterator<String> it = h1.keySet().iterator();
		while (it.hasNext()) {
			String s2 = it.next();
			String s3 = h1.get(s2);
			if (s3.equals(n))
				hm1.put(s2, s3);
		}
		return hm1;
	}

}
