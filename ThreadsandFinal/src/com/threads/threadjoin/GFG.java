package com.threads.threadjoin;

class GFG {
	public static void main(String[] args) {
		// Without join
		// ******************
		Thread t1 = new Thread(new MyClass(), "t1");
		Thread t2 = new Thread(new MyClass(), "t2");
		Thread t3 = new Thread(new MyClass(), "t3");

		t1.start();
		t2.start();
		t3.start();

		// With join
		// ******************
		Thread th1 = new Thread(new MyClass(), "th1");
		Thread th2 = new Thread(new MyClass(), "th2");
		Thread th3 = new Thread(new MyClass(), "th3");
		// Start first thread immediately
		th1.start();

		/*
		 * Start second thread(th2) once first thread(th1) is dead
		 */
		try {
			th1.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		th2.start();

		/*
		 * Start third thread(th3) once second thread(th2) is dead
		 */
		try {
			th2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		th3.start();

		// Displaying a message once third thread is dead
		try {
			th3.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}