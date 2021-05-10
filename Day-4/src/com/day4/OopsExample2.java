package com.day4;

import com.day4.FirstClass;
import com.day4.SecondClass;

public class OopsExample2 {
	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass();
		SecondClass secondClass = new SecondClass();
		System.out.println("----------------in main(): ");
		System.out.println("objA.a = " + firstClass.getFirstClass());
		System.out.println("objB.b = " + secondClass.getSecondClass());
		System.out.println("-----------------After the Updation ");
		firstClass.setFirstClass(222);
		secondClass.setSecondClass(333.33);
		System.out.println("objA.a = " + firstClass.getFirstClass());
		System.out.println("objB.b = " + secondClass.getSecondClass());
	}

}
