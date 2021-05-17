/*
 Write a program to assign the current thread to t1. Change the name of
the thread to�MyThread. Display the changed name of the thread.�Also�it
should display the current time. Put the thread to sleep for 10 seconds
and display the time again.*/
package com.day6;

import java.time.LocalTime;

public class RenameThread extends Thread {

	/**
	 * @param args
	 */
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		LocalTime time1 = LocalTime.now();
		System.out.println("After the Sleep Current Time : " + time1);
	}

	public static void main(String[] args) {
		RenameThread renameThread = new RenameThread();
		System.out.println("Current Thread Name : " + renameThread.getName());
		renameThread.setName("My Thread");

		LocalTime time = LocalTime.now();
		System.out.println("Before the sleep Current Time : " + time);
		renameThread.start();
		System.out.println("Newly changed thread Name : " + renameThread.getName());
	}

}

/*
 * In the previous program remove the try{}catch(){} block surrounding the sleep
 * method and try to execute the code. What is your observation?
 * 
 * 
 * Observation:By Removing try and catch blocks it will throws Exception,we can
 * write using throws also instead
 */
