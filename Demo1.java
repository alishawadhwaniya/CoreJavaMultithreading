package com.mypracticeofcorejava.multithreading;

public class Demo1 {
	public static void main(String[] args) {
		Thread t=new Thread();
		String name = t.getName();
		System.out.println(name);
	}
}
