package com.numbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		UserMainCode u = new UserMainCode();
		u.sumOfSquaresofEven(n);
		sc.close();

	}

}
