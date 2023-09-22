package com.mypracticeofcorejava.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo11 {
	public static void main(String[] args) throws Exception {
		Thread t1=new Thread() {
			public void run() {
				System.out.println("Run method of thread t1 executed...");
			}
		};
		t1.start();
		
		Runnable r=new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Run method of Runnable r executed...");
			}
		};
		Thread t2=new Thread(r);
		t2.start();
		
		Callable c=new Callable() {
			@Override
			public Object call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("Call method executed...");
				return "Success";
			}
		};
		ExecutorService exService=Executors.newFixedThreadPool(1);
		Future submit=exService.submit(c);
		System.out.println(submit.get().toString());
	}
}
