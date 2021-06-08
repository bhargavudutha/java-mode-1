package com.pojo;

public class Car {
	private String make;
	private String model;
	private int year;
	private float sale_price;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getSale_price() {
		return sale_price;
	}

	public void setSale_price(float sale_price) {
		this.sale_price = sale_price;
	}

	@Override
	public String toString() {
		return "Car[make=" + make + ", model=" + model + ", year=" + year + ", sale_price=" + sale_price + "]";

	}

}

