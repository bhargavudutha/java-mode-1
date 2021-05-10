package com.day4;

public class Circle extends Shape {
	private int radius;
	final float pi = (float) 3.1415;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public float calculateArea() {

		return (float) (pi * (getRadius() * getRadius()));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
