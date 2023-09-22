package com.mypracticeofcorejava.multithreading;

public class Demo15 {
	int amount=10000;
	public synchronized void deposit(int deposit) {
		amount+=deposit;
		System.out.println(deposit+" rs deposited.Now balance is "+amount);
		notify();
	}
	public synchronized void withdraw(int amt) throws InterruptedException {
		if(amt>amount) {
			System.out.println("amount is greater than balance..can't withdraw");
			wait();
		}
			amount-=amt;
			System.out.println(amt+" withdrawn.Now balance is "+amount);
		
	}
	public static void main(String[] args) {
		final Demo15 d=new Demo15();
		new Thread() {
			public void run() {
				try {
					d.withdraw(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				d.deposit(10000);
			}
		}.start();
	}
}
