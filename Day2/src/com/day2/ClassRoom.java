package com.day2;

public class ClassRoom {
	int roomNo;
	String roomType;
	int roomArea;
	boolean acMachine;

	public void setData(int roomNo, String roomType, int roomArea, boolean acMachine) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}

	public void display() {
		System.out.println("Class Room No : " + roomNo);
		System.out.println("Class Room Type : " + roomType);
		System.out.println("Class Room Area : " + roomArea + " m");
		System.out.println("Class Room Ac Machine : " + acMachine);
	}

}
