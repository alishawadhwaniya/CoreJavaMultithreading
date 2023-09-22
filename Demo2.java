package com.mypracticeofcorejava.multithreading;

public class Demo2 {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);//toString is called when we simply try to print the object.toString of Thread class returns thread name,priority etc.
		System.out.println("Name--"+currentThread.getName());
		System.out.println("ThreadGroup--"+currentThread.getThreadGroup());
		System.out.println("Priority--"+currentThread.getPriority());
	}
}

//All Java objects have a toString() method, which is invoked when you try to print the object.