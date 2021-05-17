package com.day6;

public class DemoThread2 extends Thread {
	public void run() {
		System.out.println("running child Thread in loop:");
		int counter = 1;
		while (counter < 11) {
			System.out.println(counter);
			counter = counter + 1;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
