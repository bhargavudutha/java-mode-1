package com.day6;

public abstract class Number implements Runnable {

	public void run(int num) {
		System.out.println("Displaying the multiples of : " + num);
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(num);
		System.out.println("Those are the multiples of : " + num);
	}

	public Number() {
		Thread thread = new Thread();
		thread.start();
	}

}
