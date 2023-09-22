package com.mypracticeofcorejava.multithreading;

public class Demo8 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread executed..");
		}else {
			System.out.println("Normal thread executed...");
		}
	}
	public static void main(String[] args) {
		Demo8 d=new Demo8();
		Thread t=new Thread(d);
		t.setDaemon(true);
		t.start();
		System.out.println("to give daemon thread time to execute..");
	}
}
//In real world we don't create daemon thread..garbage collector is a daemon thread..we don't run garbage collector .it is running internally.