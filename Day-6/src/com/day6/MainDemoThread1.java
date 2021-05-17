/*Write a program to create a class DemoThread1 implementing RunnableIn the constructor, create a new thread and start the thread.
interface. In the constructor, create a new thread and start the thread.
In run() display a message &quot;running child Thread in loop : &quot; display the
value of the counter ranging from 1 to 10. Within the loop put the thread
to sleep for 2 seconds. In main create 3 objects of the DemoTread1 and
execute the program.*/

package com.day6;

public class MainDemoThread1 {
	public static void main(String[] args) {
		DemoThread1 obj1 = new DemoThread1();

		DemoThread1 obj2 = new DemoThread1();

		DemoThread1 obj3 = new DemoThread1();
		obj1.run();
		obj2.run();
		obj3.run();
	}

	public void DemoThread1() {

		Thread thread = new Thread();
		System.out.println("Name of thread:" + thread.getName());
		thread.start();

	}

}
