package com.mypracticeofcorejava.multithreading;

public class Demo12{
	
	public static void main(String[] args) {
		String s1="Hi";
		String s2="Hello";
		Thread t1=new Thread() {
			public void run() {
				synchronized(s1) {
					System.out.println("Thread 1 locked resource 1");
					synchronized(s2) {
						System.out.println("Thread 1 waiting for resource 2");
					}
				}
			}
		};
	}
}
