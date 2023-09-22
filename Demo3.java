package com.mypracticeofcorejava.multithreading;

public class Demo3 extends Thread{
	
	public void run() {
		System.out.println("mythread started...");
		m1();
		System.out.println("mythread completed...");
	}
	
	public void m1() {
		System.out.println("I am from m1 method...");
	}
	
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		String name = currentThread.getName();
		System.out.println(name+"--thread started...");
		
		Demo3 d=new Demo3();
//		d.m1();
		Thread t=new Thread(d);
		t.start();//this will start the thread and internally it will call run method.
		
		System.out.println(name+"--thread completed...");
	}
}

/*
 
 here when we do d.m1(), the program is being executed by the main thread which can be known from sequential execution order.
 whereas when we want our logic to be executed simultaneously or parallelly so that the program execution time becomes less.
 that is what we are doing here...orignally without us creating the thread and starting the thread what would happen is that when we do d.m1()
 the m1 method is executed the control goes to m1 and after m1 method execution the control comes back to main method and then the remaining logic 
 in the main method is executed....whereas when we create our own thread(user defined thread)(user defined thread can be created in two ways:-
 by extending from thread class or by implementing runnable interface) 
 here we are creating user defined thread by extending from thread class..now when we do Thread t=new Thread(d) we are connecting our object d
 with our thread. and when we do t.start(), it starts our thread and internally calls the run method and all the logic in the run method is 
 executed...so since our thread is started and our object is connected to our thread, the main thread(default thread for execution of main method)
 does its work individually and its work is to execute logic in main method, while logic in run method is executed by thread created by us.
 when we do t.start() the t obj will look for the object connected with our thread (i.e=>d obj)..and then it will look for run method in the class
 of d object which is Demo3 here.
 
*/