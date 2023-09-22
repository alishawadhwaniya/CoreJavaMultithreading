package com.mypracticeofcorejava.multithreading;

//WHY SYNCHRONIZATION ?

public class Demo9 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int availableTickets=100;
		if(availableTickets>0) {
//			logic to book ticket
			--availableTickets;
		}
	}
	public static void main(String[] args) {
		Demo9 d=new Demo9();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		Thread t3=new Thread(d);
		t1.start();
		t2.start();
		t3.start();
	}
}

/*
 HERE WE HAVE A PROGRAM TO BOOK MOVIE TICKETS AND WE HAVE AN INSTANCE VARIABLE AVAILABLE TICKETS.NOW WHAT HAPPENS HERE IS THAT THE MULTIPLE
 THREADS t1,t2,t3 START ACTING ON THE METHOD PARALLELLY AND AS A RESULT OF THAT THERE ARISES A PROBLEM OF DATA INCONSISTENCY CAUSE BY DEFAULT
 OUR METHOD IS NOT THREAD SAFE...NOT THREAD SAFE MEANING THAT MULTIPLE THREADS CAN ACT ON IT SIMULTANEOUSLY....HERE WHEN MULTIPLE THREADS ACT ON
 THE METHOD SIMULTANEOUSLY THE THREADS DON'T HAVE THE RIGHT VALUE OF THE VARIABLE availableTicket..CAUSE THE THREAD DOESN'T WAIT FOR THE PREVIOUS
 THREAD TO ACT ON THE METHOD AND CHANGE THE VALUE OF THE VARIABLE availableTicket. AND HENCE MULTIPLE THREADS MAY HAVE THE VALUE OF THE VARIABLE 
 TO BE 100 WHICH MAKES OUR PROGRAM LOGIC INCORRECT.SO THERE IS A CONCEPT OF SYNCHRONIZATION MEANING THREAD SAFE MEANING THAT ONE THREAD WILL ACT 
 ON THE LOGIC AT A TIME,AND ONLY AFTER ONE THREAD HAS ACTED ON IT THEN THE NEXT THREAD WILL ACT ON IT.
 DATA INCONSISTENCY IS NOTHING BUT READING INCORRECT DATA.
*/
