package com.mypracticeofcorejava.multithreading;

public class Demo10 implements Runnable{
	public void printNums() {
		synchronized(this) {
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+"=>"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printNums();
	}
	public static void main(String[] args) {
		Demo10 d=new Demo10();
		Thread t1=new Thread(d);
		t1.setName("Thread-1");
		t1.start();
		
		Thread t2=new Thread(d);
		t2.setName("Thread-2");
		t2.start();
	}
}
