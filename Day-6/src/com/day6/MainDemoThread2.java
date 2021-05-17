/* Rewrite the earlier program so that, now the class DemoThread1 instead
of implementing from Runnable interface, will now extend from Thread
class.*/
package com.day6;

public class MainDemoThread2 {
	public static void main(String[] args) {
		DemoThread2 demoThread2 = new DemoThread2();
		demoThread2.run();
	}

}
