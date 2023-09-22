package com.mypracticeofcorejava.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo7 implements Callable {
	@Override
	public Object call() throws Exception {
		System.out.println("Call method executed...");
		return "Success";
	}
	public static void main(String[] args) throws Exception {
		Demo7 d=new Demo7();
		ExecutorService exService = Executors.newFixedThreadPool(10);
		for(int i=1;i<=15;i++) {
			Future submit=exService.submit(d);
			System.out.println(submit.get().toString());
		}
		exService.isShutdown();
	}
}
