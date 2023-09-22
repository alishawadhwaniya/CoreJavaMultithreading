package com.mypracticeofcorejava.multithreading;

public class Demo6 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method started by..."+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Run method ended by..."+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Demo6 d=new Demo6();
		Thread t1=new Thread(d);
		t1.setName("Thread-1");
//		t1.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);//10
		
		Thread t2=new Thread(d);
		t2.setName("Thread-2");
//		t2.setPriority(5);
		t2.setPriority(Thread.NORM_PRIORITY);//5
		
		Thread t3=new Thread(d);
		t3.setName("Thread-3");
//		t3.setPriority(1);
		t3.setPriority(Thread.MIN_PRIORITY);//1
		
		t1.start();
//		t1.start(); doing this would give Runtime exception..We can't start one thread more than once.It would give illegalthreadstateexception.
//		we can however run one program more than once by using multiple threads.
		t2.start();
		t3.start();
	}
}

/*
 we can set name and set priority of the thread...setting priority means telling thread schedular that we want this particular thread to have
 higher priority..the thread schedular may or may not obey the priority given by us.and hence the threads may execute in any order despite of us
 giving the priority.
 */
