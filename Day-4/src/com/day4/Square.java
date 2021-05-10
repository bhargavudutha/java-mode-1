package com.day4;

public class Square extends Shape {
	private int side;

	public Square(String name, int side) {
		super(name);
		this.side = side;

	}

	@Override
	public float calculateArea() {

		return getSide() * getSide();
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
