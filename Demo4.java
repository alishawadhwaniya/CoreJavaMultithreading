package com.mypracticeofcorejava.multithreading;

public class Demo4 implements Runnable {
	public void run() {
		System.out.println("run method started...");
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		System.out.println("run method ended...");
	}
	public static void main(String[] args) {
		Demo4 d=new Demo4();
		Thread t=new Thread(d);
		t.start();
		t.run();
	}
}

/*

here we created user defined thread not by extending from thread class but instead implementing runnable interface.
Also note that we can simply call run()method...by doing either d.run() or t.run(). and the output clearly indicates what happens.
first of all the main method has to be executed by jvm.jvm does that by using main thread and so the execution of main method begins,and
in the main method we created a thread and we did t.start() so our user defined thread starts and execution of run method happens simultaneously
while in the main method the t.run() method is also executed and the current thread becomes the main thread as t.run() is executed by main thread
and so we see the output in console and all the while our user defined thread also calls the run() method and so the current thread becomes 
our user defined thread as we would see in the console(Thread-0).

*/
