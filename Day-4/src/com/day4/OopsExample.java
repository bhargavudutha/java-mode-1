package com.day4;

import com.day4.A;

public class OopsExample {
	public static void main(String[] args) {

		A objA = new A();
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.getA());
		objA.setA(222);

	}

}
