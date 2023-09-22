package com.mypracticeofcorejava.multithreading;

public class Demo5 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method started...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Run method ended...");
		
	}
	
	public static void main(String[] args) {
		Demo5 d=new Demo5();
		Thread t=new Thread(d);
		t.start();
	}
}

/*
 THREAD LIFE CYCLE:- 
 1)NEW
 2)RUNNABLE (start() method)
 3)RUNNING   (run() method is executed)
 4)BLOCKED   (sleep() method when executed)
 5)TERMINATED
*/