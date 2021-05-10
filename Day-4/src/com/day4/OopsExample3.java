package com.day4;

import com.day4.ClassA;
import com.day4.ClassB;
import com.day4.ClassC;

public class OopsExample3 {
	public static void main(String[] args) {
		ClassA objA = new ClassA();
		ClassB objB1 = new ClassB();
		ClassA objB2 = new ClassB();
		ClassC objC1 = new ClassC();
		ClassB objC2 = new ClassC();
		ClassA objC3 = new ClassC();
		objA.display();
		objB1.display();
		objB2.display();
		objC1.display();
		objC2.display();
		objC3.display();

	}

}
