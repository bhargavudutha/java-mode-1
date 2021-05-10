package com.day2;

public class Bike extends Cycle {
	public String define_me1() {
		return "a cycle with an engine.";
	}

	public Bike() {
		System.out.println("Hello I am a MotorCycle, I am " + define_me1());
		String temp = define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}
