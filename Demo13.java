package com.mypracticeofcorejava.multithreading;

class ATM{
	
		synchronized public void checkBalance(String name) {
			System.out.println(name+" has ");
			System.out.println("Balance");
			
		}
		synchronized public void withdraw(String name,int amount) {
			System.out.println(name+" withdrew ");
			System.out.println(amount);
		}
	
	
}
class Customer implements Runnable{
	ATM atm;
	String name;
	int amount;
	public void useAtm() {
		 
			atm.checkBalance(name);
			atm.withdraw(name,amount);	
	}
	public void run() {
		useAtm();
	}
}

public class Demo13 {
	public static void main(String[] args) {
		ATM atm=new ATM();
		Customer c1=new Customer();
		c1.name="Raju";
		c1.amount=10000;
		c1.atm=atm;
		Thread t1=new Thread(c1);
		
		Customer c2=new Customer();
		c2.name="Aman";
		c2.amount=50000;
		c2.atm=atm;
		Thread t2=new Thread(c2);
		
		t1.start();
		t2.start();
	}
}
